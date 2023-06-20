package com.example.service.ex;

public class WorkByNameException extends ServiceException{

    public WorkByNameException() {
        super();
    }

    public WorkByNameException(String message) {
        super(message);
    }

    public WorkByNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkByNameException(Throwable cause) {
        super(cause);
    }

    protected WorkByNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
