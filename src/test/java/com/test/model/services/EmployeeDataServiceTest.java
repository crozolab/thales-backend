package com.test.model.services;

import com.api.thales.model.dto.EmployeeDTO;
import com.api.thales.model.dto.ResponseIdDTO;
import com.api.thales.model.services.EmployeeDataService;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeDataServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @InjectMocks
    private EmployeeDataService empService = new EmployeeDataService();
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void SucessConsumeAndOperation() {
        EmployeeDTO emp = new EmployeeDTO(1L, "camilo", 3000.0, 29, "", 233467.00);
        ResponseIdDTO responseIdDTO = new ResponseIdDTO("success", emp, "Successfully! Record has been fetched.");
        String uri = "http://dummy.restapiexample.com/api/v1/employee/1";
        Mockito.when(restTemplate.getForObject(uri, ResponseIdDTO.class)).thenReturn(responseIdDTO);
        empService.getEmployeeById(1L);
        assertEquals(emp, responseIdDTO.getData());
    }

    @Test
    public void FailedConsume() {

        EmployeeDTO emp = new EmployeeDTO(1L, "camilo", 3000.0, 29, "", 233467.00);
        ResponseIdDTO responseIdDTO = new ResponseIdDTO("success", emp, "Successfully! Record has been fetched.");
        String uri = "http://dummy.restapiexample.com/api/v1/employee/2";
        Mockito.when(restTemplate.getForObject(uri, ResponseIdDTO.class)).thenReturn(responseIdDTO);
        Executable executable = () -> empService.getEmployeeById(1L);
        Assertions.assertThrows(RuntimeException.class, executable);

    }


}
