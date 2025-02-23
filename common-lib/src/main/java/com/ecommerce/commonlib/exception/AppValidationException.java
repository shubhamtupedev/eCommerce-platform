package com.ecommerce.commonlib.exception;

public class AppValidationException extends RuntimeException {

    private String errorCode;

    public AppValidationException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
