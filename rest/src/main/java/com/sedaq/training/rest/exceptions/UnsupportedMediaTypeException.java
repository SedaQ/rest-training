package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 */
@ResponseStatus(value = HttpStatus.UNSUPPORTED_MEDIA_TYPE,
        reason = "The request entity has a media type which the server or resource does not support. For example, the client uploads an image as image/svg+xml, but the server requires that images use a different format.")
public class UnsupportedMediaTypeException extends RuntimeException {

    public UnsupportedMediaTypeException() {
    }

    public UnsupportedMediaTypeException(String message) {
        super(message);
    }

    public UnsupportedMediaTypeException(String message, Throwable ex) {
        super(message, ex);
    }

    public UnsupportedMediaTypeException(Throwable ex) {
        super(ex);
    }

}
