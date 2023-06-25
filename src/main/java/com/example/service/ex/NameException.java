package com.example.service.ex;

public class NameException extends ServiceException{

    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }

    public NameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameException(Throwable cause) {
        super(cause);
    }

    protected NameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
