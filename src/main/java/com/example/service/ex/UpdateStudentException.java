package com.example.service.ex;

public class UpdateStudentException extends ServiceException{

    public UpdateStudentException() {
    }

    public UpdateStudentException(String message) {
        super(message);
    }

    public UpdateStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateStudentException(Throwable cause) {
        super(cause);
    }

    public UpdateStudentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
