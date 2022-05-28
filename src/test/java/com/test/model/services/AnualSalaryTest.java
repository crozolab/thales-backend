package com.test.model.services;

import com.api.thales.model.services.AnualSalaryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AnualSalaryTest {


    @Test
    void addition() {
        Assertions.assertEquals(24.0, AnualSalaryService.calculate(2.0));
    }
    @Test
    void additionFail() {
       Double salary = AnualSalaryService.calculate(2.0);
        Assertions.assertFalse(salary == 25.0);
    }

}
