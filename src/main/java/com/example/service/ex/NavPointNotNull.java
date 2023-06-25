package com.example.service.ex;

public class NavPointNotNull extends ServiceException {

    public NavPointNotNull() {
        super();
    }

    public NavPointNotNull(String message) {
        super(message);
    }

    public NavPointNotNull(String message, Throwable cause) {
        super(message, cause);
    }

    public NavPointNotNull(Throwable cause) {
        super(cause);
    }

    protected NavPointNotNull(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
