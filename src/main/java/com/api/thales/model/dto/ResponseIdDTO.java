package com.api.thales.model.dto;

public class ResponseIdDTO {
    private String status;
    private EmployeeDTO data;
    private String message;

    public ResponseIdDTO(String status, EmployeeDTO data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public ResponseIdDTO() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EmployeeDTO getData() {
        return data;
    }

    public void setData(EmployeeDTO data) {
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
        return "ResponseIdDTO{" +
                "status='" + status + '\'' +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
