package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,
        reason = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource or may need an account of some sort.")
public class ForbiddenException extends RuntimeException {

    public ForbiddenException() {
    }

    public ForbiddenException(String message) {
        super(message);
    }

    public ForbiddenException(String message, Throwable ex) {
        super(message, ex);
    }

    public ForbiddenException(Throwable ex) {
        super(ex);
    }

}
