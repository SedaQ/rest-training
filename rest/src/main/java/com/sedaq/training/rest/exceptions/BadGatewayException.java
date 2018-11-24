package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "The server was acting as a gateway or proxy and received an invalid response from the upstream server.")
public class BadGatewayException extends RuntimeException {

    public BadGatewayException() {
    }

    public BadGatewayException(String message) {
        super(message);
    }

    public BadGatewayException(String message, Throwable ex) {
        super(message, ex);
    }

    public BadGatewayException(Throwable ex) {
        super(ex);
    }

}
