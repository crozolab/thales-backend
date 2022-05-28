package com.api.thales.model.dto;

import java.util.Arrays;

public class ResponseDTO {
    private String status;
    private EmployeeDTO[] data;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EmployeeDTO[] getData() {
        return data;
    }

    public void setData(EmployeeDTO[] data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "status='" + status + '\'' +
                ", data=" + Arrays.toString(data) +
                ", message='" + message + '\'' +
                '}';
    }
}
