package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "The server successfully processed the request and is not returning any content.")
public class NoContentException extends RuntimeException {

    public NoContentException() {
    }

    public NoContentException(String message) {
        super(message);
    }

    public NoContentException(String message, Throwable ex) {
        super(message, ex);
    }

    public NoContentException(Throwable ex) {
        super(ex);
    }

}
