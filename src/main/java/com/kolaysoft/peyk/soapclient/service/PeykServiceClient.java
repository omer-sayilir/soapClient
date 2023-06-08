package com.kolaysoft.peyk.soapclient.service;

import com.kolaysoft.peyk.soapclient.ws.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PeykServiceClient {
    private final String URL = "https://peyktest.kolaysoft.com.tr/ik-platform/services/ikService";

    private final PeykService peykService;

    public PeykServiceClient(PeykService peykService) {
        this.peykService = peykService;
    }

    public void callGetIlLer() {

        GetIller request = new GetIller();
        IlPyld response = ((GetIllerResponse) peykService.performRequest(URL, request)).getReturn();
        if (response.getError() != null) {
            System.out.println(response.getError());
        } else {
            List<IlDto> iller = response.getIlDto();
            for (IlDto il : iller) {
                System.out.println(il.getIlId());
            }
        }


    }

    public void callGetEmployee(Integer page, Integer size) {

        GetEmployee request = new GetEmployee();
        request.setPage(page);
        request.setSize(size);
        EmployeeListDto response = ((GetEmployeeResponse) peykService.performRequest(URL, request)).getReturn();
        if (response.getError() != null) {
            System.out.println(response.getError());
        } else {
            List<EmployeeDto> employeeList = response.getList();
            for (EmployeeDto employee : employeeList) {
                System.out.println(employee.getTckn() + " " + employee.getName() + " " + employee.getSurname());
            }
        }


    }

    public void callEmployeeByTckn(String tckno) {

        GetEmployeeByTckn request = new GetEmployeeByTckn();
        request.setTckn(tckno);
        EmployeeGetPyld response = ((GetEmployeeByTcknResponse) peykService.performRequest(URL, request)).getReturn();
        if (!response.isError()) {
            EmployeePyld employee = response.getEmployee();
            System.out.println(employee.getTckn() + " " + employee.getName() + " " + employee.getSurname() +" "+ employee.getActivationStatus()+" "+employee.getEmploymentStatus());
        } else {
            System.out.println(response.isError());
        }


    }

    public void updateEmployeeStatus(List<String> tckNoList, Integer activasyonStatus) {

        UpdateEmployeeStatus request = new UpdateEmployeeStatus();
        request.setActivationStatus(activasyonStatus);
        for (String tckno : tckNoList) {
            request.getEmployeeTcknList().add(tckno);
        }

        EmployeeResultPyld response = ((UpdateEmployeeStatusResponse) peykService.performRequest(URL, request)).getReturn();
        if (!response.isError()) {
            List<EmployeeShortResult> resultList = response.getSavedEmployeeList();
            for (EmployeeShortResult employee : resultList) {
                System.out.println(employee.getTckn() + " " + employee.getName() + " " + employee.getSurname());
            }

        } else {
            System.out.println(response.isError());
        }


    }
}
