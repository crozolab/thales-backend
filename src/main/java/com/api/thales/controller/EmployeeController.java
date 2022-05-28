package com.api.thales.controller;

import com.api.thales.model.dto.EmployeeDTO;
import com.api.thales.model.services.EmployeeDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeDataService employeeDataService;

    public EmployeeController(EmployeeDataService employeeDataService) {
        this.employeeDataService = employeeDataService;
    }

    @GetMapping
    public ResponseEntity<Object> listEmployees() {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.employeeDataService.getEmployees());
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<EmployeeDTO> listEmployeesById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.employeeDataService.getEmployeeById(id));
    }

}
