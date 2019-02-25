package com.sedaq.training.exceptions;

/**
 * @author Pavel Šeda
 */
public class ServiceLayerException extends RuntimeException {

    public ServiceLayerException() {
    }

    public ServiceLayerException(String message) {
        super(message);
    }

    public ServiceLayerException(Throwable throwable) {
        super(throwable);
    }

    public ServiceLayerException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
