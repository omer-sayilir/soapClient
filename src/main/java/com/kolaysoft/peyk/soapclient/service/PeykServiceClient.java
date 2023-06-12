package com.kolaysoft.peyk.soapclient.service;

import com.kolaysoft.peyk.soapclient.ws.*;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@Component
public class PeykServiceClient {
    private final String URL = "https://peyktest.kolaysoft.com.tr/ik-platform/services/ikService";

    private final PeykService peykService;

    public PeykServiceClient(PeykService peykService) {
        this.peykService = peykService;
    }

    public IlPyld CallGetIlLer() {

        GetIller request = new GetIller();
        IlPyld response = ((GetIllerResponse) peykService.performRequest(URL, request)).getReturn();
        return response;

    }

    public IlcePyld CallGetIlceler() {

        GetIlceler request = new GetIlceler();
        request.setIlId(27);
        IlcePyld response = ((GetIlcelerResponse) peykService.performRequest(URL, request)).getReturn();
        return response;


    }

    public EmployeeListDto CallGetEmployee(Integer page, Integer size) {

        GetEmployee request = new GetEmployee();
        request.setPage(page);
        request.setSize(size);
        EmployeeListDto response = ((GetEmployeeResponse) peykService.performRequest(URL, request)).getReturn();
       return response;

    }

    public EmployeeGetPyld CallEmployeeByTckn(String tckno) {

        GetEmployeeByTckn request = new GetEmployeeByTckn();
        request.setTckn(tckno);
        EmployeeGetPyld response = ((GetEmployeeByTcknResponse) peykService.performRequest(URL, request)).getReturn();
        return response;

    }

    public EmployeeResultPyld UpdateEmployeeStatus(List<String> tckNoList, Integer activasyonStatus) {

        UpdateEmployeeStatus request = new UpdateEmployeeStatus();
        request.setActivationStatus(activasyonStatus);
        for (String tckno : tckNoList) {
            request.getEmployeeTcknList().add(tckno);
        }

        EmployeeResultPyld response = ((UpdateEmployeeStatusResponse) peykService.performRequest(URL, request)).getReturn();
        return response;


    }

    public EmployeeResultPyld ImportMultipleEmployees(List<EmployeePyld> employeeList) {

        ImportMultipleEmployees request = new ImportMultipleEmployees();
        for (EmployeePyld employee : employeeList) {
            request.getEmployees().add(employee);
        }
        EmployeeResultPyld response = ((ImportMultipleEmployeesResponse) peykService.performRequest(URL, request)).getReturn();
        return response;
    }

    public DocumentListPyld GetBordroByEmployee(String tckno, Integer page, Integer size) {

        GetBordroByEmployee request = new GetBordroByEmployee();
        request.setTckn(tckno);
        request.setPage(page);
        request.setSize(size);

        DocumentListPyld response = ((GetBordroByEmployeeResponse) peykService.performRequest(URL, request)).getReturn();

       return response;
    }

    public DocumentListPyld GetBordroByDateRange(String startDate, String endDate, Integer page, Integer size) throws DatatypeConfigurationException {

        XMLGregorianCalendar start = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(startDate);
        XMLGregorianCalendar end = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(startDate);

        GetBordroByDateRange request = new GetBordroByDateRange();
        request.setStart(start);
        request.setStart(end);
        request.setPage(page);
        request.setSize(size);

        DocumentListPyld response = ((GetBordroByDateRangeResponse) peykService.performRequest(URL, request)).getReturn();

        return response;

    }

    public DocumentResultPyld ImportBordroByByteArray(String fileName, Integer month,Integer year, byte[] bulkBytes){

        ImportBordroByByteArray request= new ImportBordroByByteArray();
        request.setFileName(fileName);
        request.setMonth(month);
        request.setYear(year);
        request.setBulkBytes(bulkBytes);

        DocumentResultPyld response = ((ImportBordroByByteArrayResponse) peykService.performRequest(URL, request)).getReturn();

        return response;
    }
}
