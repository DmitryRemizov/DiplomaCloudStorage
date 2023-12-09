package ru.netology.exception;

public class GettingFileListException extends RuntimeException {

    /**
     *  @author Dmitry Remizov
     *  9.12.2023
     */

    public GettingFileListException() {
    }

    public GettingFileListException(String message) {
        super(message);
    }

    public GettingFileListException(String message, Throwable cause) {
        super(message, cause);
    }

    public GettingFileListException(Throwable cause) {
        super(cause);
    }

    public GettingFileListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}