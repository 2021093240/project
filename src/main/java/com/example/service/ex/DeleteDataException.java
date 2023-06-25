package com.example.service.ex;

public class DeleteDataException extends ServiceException{

    public DeleteDataException() {
    }

    public DeleteDataException(String message) {
        super(message);
    }

    public DeleteDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteDataException(Throwable cause) {
        super(cause);
    }

    public DeleteDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
