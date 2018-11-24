package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE,
        reason = "The server is currently unavailable (because it is overloaded or down for maintenance). Generally, this is a temporary state.")
public class ServiceUnavailableException extends RuntimeException {

    public ServiceUnavailableException() {
    }

    public ServiceUnavailableException(String message) {
        super(message);
    }

    public ServiceUnavailableException(String message, Throwable ex) {
        super(message, ex);
    }

    public ServiceUnavailableException(Throwable ex) {
        super(ex);
    }

}
