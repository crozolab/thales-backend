package com.api.thales.model.services;

import com.api.thales.model.dto.EmployeeDTO;
import com.api.thales.model.dto.ResponseDTO;
import com.api.thales.model.dto.ResponseIdDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeDataService {
    private static final String URI_ALL_EMPLOYEES = "https://mocki.io/v1/3edaeacf-f25d-466c-b03a-3bbaeb2c0bb5";
    private static final String URI_SINGLE_EMPLOYEE = "http://dummy.restapiexample.com/api/v1/employee/";
    @Autowired
    RestTemplate restTemplate;

    public List<EmployeeDTO> getEmployees() {
        //String uri = "http://dummy.restapiexample.com/api/v1/employees";
        try {
            ResponseDTO response = restTemplate.getForObject(URI_ALL_EMPLOYEES, ResponseDTO.class);
            List<EmployeeDTO> employeeDTOList = Arrays.asList(Objects.requireNonNull(response).getData());
            for (EmployeeDTO employee : employeeDTOList) {
                Double salary = AnualSalaryService.calculate(employee.getEmployee_salary());
                employee.setEmployee_anual_salary(salary);
            }
            return employeeDTOList;
        } catch (Exception e) {
            System.out.println("Something went wrong");
            throw new RuntimeException();
        }

    }

    public EmployeeDTO getEmployeeById(Long id) {
        try {
            ResponseIdDTO response = restTemplate.getForObject( URI_SINGLE_EMPLOYEE + id, ResponseIdDTO.class);
            EmployeeDTO employeeDTO = Objects.requireNonNull(response).getData();
            Double salary = AnualSalaryService.calculate(employeeDTO.getEmployee_salary());
            employeeDTO.setEmployee_anual_salary(salary);
            return employeeDTO;
        } catch (Exception e) {
            System.out.println("Something went wrong");
            throw new RuntimeException();
        }
    }

}
