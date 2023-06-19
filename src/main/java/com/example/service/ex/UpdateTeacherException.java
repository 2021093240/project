package com.example.service.ex;

public class UpdateTeacherException extends ServiceException {

    public UpdateTeacherException() {
        super();
    }

    public UpdateTeacherException(String message) {
        super(message);
    }

    public UpdateTeacherException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateTeacherException(Throwable cause) {
        super(cause);
    }

    protected UpdateTeacherException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
