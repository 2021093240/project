package com.example.service.ex;

public class TeacherNotFound extends ServiceException {

    public TeacherNotFound() {
        super();
    }

    public TeacherNotFound(String message) {
        super(message);
    }

    public TeacherNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public TeacherNotFound(Throwable cause) {
        super(cause);
    }

    protected TeacherNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
