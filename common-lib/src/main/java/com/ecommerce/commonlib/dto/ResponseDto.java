package com.ecommerce.commonlib.dto;

public class ResponseDto<T> {

    private String status;
    private String message;
    private T response;
    private int statusCode;

    public ResponseDto(String status, String message, T response, int statusCode) {
        this.status = status;
        this.message = message;
        this.response = response;
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
