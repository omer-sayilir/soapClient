package com.kolaysoft.peyk.soapclient.helper;

import com.kolaysoft.peyk.soapclient.service.PeykServiceClient;
import com.kolaysoft.peyk.soapclient.ws.*;
import org.springframework.core.io.ClassPathResource;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PeykWsHelper {

    public final PeykServiceClient peykServiceClient;

    public PeykWsHelper(PeykServiceClient peykServiceClient) {
        this.peykServiceClient = peykServiceClient;
    }

    public void GetIller() {
        IlPyld response = peykServiceClient.CallGetIlLer();
        if (response.getError() != null) {
            System.out.println(response.getError());
        } else {
            List<IlDto> iller = response.getIlDto();
            for (IlDto il : iller) {
                System.out.println(il.getIlId());
            }
        }

    }

    public void GetIlceler() {
        IlcePyld response = peykServiceClient.CallGetIlceler();
        if (response.getError() != null) {
            System.out.println(response.getError());
        } else {
            List<IlceDto> ilceler = response.getIlceDto();
            for (IlceDto ilce : ilceler) {
                System.out.println(ilce.getIlceId());
            }
        }
    }

    //region employee

    /**
     * employee
     */
    public void GetEmployeeDetail() {
        EmployeeGetPyld response = peykServiceClient.CallEmployeeByTckn("22222222220");
        if (!response.isError()) {
            EmployeePyld employee = response.getEmployee();
            System.out.println(employee.getTckn() + " " + employee.getName() + " " + employee.getSurname() + " " + employee.getActivationStatus() + " " + employee.getEmploymentStatus());
        } else {
            System.out.println(response.isError());
        }
    }

    public void UpdateEmployeeStatus() {
        List<String> employeeTckNoList = new ArrayList<>();
        employeeTckNoList.add("22222222220");
        //0-> AKTİF, 1->ADAY, 2-> PASİF, 3-> FESİH
        Integer status = 0;
        EmployeeResultPyld response = peykServiceClient.UpdateEmployeeStatus(employeeTckNoList, status);

        if (!response.isError()) {
            List<EmployeeShortResult> resultList = response.getSavedEmployeeList();
            for (EmployeeShortResult employee : resultList) {
                System.out.println(employee.getTckn() + " " + employee.getName() + " " + employee.getSurname());
            }
        } else {
            System.out.println(response.getComment());
        }

    }

    public void CreateNewEmployee() {
        List<EmployeePyld> newEmployeeList = new ArrayList<>();
        EmployeePyld employee = new EmployeePyld();
        // zorunlu alanlar name, surname, tckn ve telephone
        employee.setTckn("11223344550");
        employee.setName("Erdem");
        employee.setSurname("Bayrak");
        employee.setTelephone("05454441444");
        newEmployeeList.add(employee);
        EmployeeResultPyld response = peykServiceClient.ImportMultipleEmployees(newEmployeeList);

        if (!response.isError()) {
            List<EmployeeShortResult> resultList = response.getSavedEmployeeList();
            for (EmployeeShortResult newEmployee : resultList) {
                System.out.println("added employee: " + newEmployee.getTckn());
            }
        } else {
            System.out.println(response.getComment());
        }
    }

    public void GetEmployeeListOfCompany() {
        Integer page = 0;
        Integer size = 10;
        EmployeeListDto response = peykServiceClient.CallGetEmployee(page, size);
        if (response.getError() != null) {
            System.out.println(response.getError());
        } else {
            List<EmployeeDto> employeeList = response.getList();
            for (EmployeeDto employee : employeeList) {
                System.out.println(employee.getTckn() + " " + employee.getName() + " " + employee.getSurname());
            }
        }

    }

    //endregion

    //region bordro

    /**
     * bordro
     */

    public void GetBordroOfEmployee() {
        Integer page = 0;
        Integer size = 10;
        String tckn = "23168513908";
        DocumentListPyld response = peykServiceClient.GetBordroByEmployee(tckn, page, size);
        Random ran = new Random();

        if (response.getError() == null) {
            List<DocumentPyld> resultList = response.getList();
            if (resultList.size() == 0) {
                System.out.println("bordro bulunamamistir");
                return;
            }
            for (DocumentPyld document : resultList) {
                int rand = ran.nextInt(6) + 5;
                String outputFile="/tmp/peykBordro/"+document.getTckn()+"_"+rand+".pdf";
                try (FileOutputStream fos = new FileOutputStream(outputFile)) {

                    fos.write(document.getBytes());

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("total bordro count:"+response.getTotalCount()+  " bordro employee Tckn: " + document.getTckn()+" outputFile:"+outputFile);

            }
        } else {
            System.out.println("GetBordroOfEmployee error" + response.getError());
        }
    }

    public void GetBordroOfCompanyByDateRange() {
        Integer page = 0;
        Integer size = 10;
        String startDate = "2023-01-01";
        String endDate = "2023-05-01";

        try {
            DocumentListPyld response = peykServiceClient.GetBordroByDateRange(startDate, endDate, page, size);
            if (response.getError() == null) {
                List<DocumentPyld> resultList = response.getList();
                if (resultList.size() == 0) {
                    System.out.println("bordro bulunamamistir");
                    return;
                }
                for (DocumentPyld document : resultList) {
                    System.out.println("bordro employee Tckn: " + document.getTckn());
                }
            } else {
                System.out.println("GetBordroOfEmployee error" + response.getError());
            }
        } catch (DatatypeConfigurationException e) {
            System.out.println("GetBordroOfCompanyByDateRange date convert error");
        }


    }

    public void UploadBordro() {
        try {
        String fileName = "bordro_202305.pdf";
        Integer month = 5;
        Integer year = 2023;
        ClassPathResource resource = new ClassPathResource("bordro_202305.pdf");
        byte[] bulkBytes  = Files.readAllBytes(Paths.get(resource.getURI()));

        DocumentResultPyld response = peykServiceClient.ImportBordroByByteArray(fileName,month,year,bulkBytes);

        if(response.isError()){
            System.out.println("UploadBordro error "+response.getComment());
        }else {
            System.out.println(" bordro session number: "+response.getSessionNumber());
            List<Integer> idList=response.getIdList();
            for (Integer id:idList) {
                System.out.println(" bordo Id "+ id);
            }

        }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //endregion
}