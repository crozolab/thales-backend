package com.api.thales.model.dto;

public class EmployeeDTO {
    private Long id;
    private String employee_name;
    private Double employee_salary;
    private Integer employee_age;
    private String profile_image;
    private Double employee_anual_salary ;



    public Double getEmployee_anual_salary() {
        return employee_anual_salary;
    }

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String employee_name, Double employee_salary, Integer employee_age, String profile_image, Double employee_anual_salary) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_image = profile_image;
        this.employee_anual_salary = employee_anual_salary;
    }

    public void setEmployee_anual_salary(Double employee_anual_salary) {
        this.employee_anual_salary = employee_anual_salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_salary=" + employee_salary +
                ", employee_age=" + employee_age +
                ", profile_image='" + profile_image + '\'' +
                ", employee_anual_salary=" + employee_anual_salary +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public Integer getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(Integer employee_age) {
        this.employee_age = employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

}
