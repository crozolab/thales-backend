package com.api.thales.model.services;

import org.springframework.stereotype.Service;

@Service
public class AnualSalaryService {
    public static double calculate(Double salary) {
        return salary * 12;
    }
}
