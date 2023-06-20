package com.example.service.ex;

public class ListNotFoundException extends ServiceException{

    public ListNotFoundException() {
    }

    public ListNotFoundException(String message) {
        super(message);
    }

    public ListNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListNotFoundException(Throwable cause) {
        super(cause);
    }

    public ListNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
