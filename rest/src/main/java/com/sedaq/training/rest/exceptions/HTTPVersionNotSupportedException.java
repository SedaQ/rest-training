package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.HTTP_VERSION_NOT_SUPPORTED, reason = "The server does not support the HTTP protocol version used in the request.")
public class HTTPVersionNotSupportedException extends RuntimeException {

  public HTTPVersionNotSupportedException() {}

  public HTTPVersionNotSupportedException(String message) {
    super(message);
  }

  public HTTPVersionNotSupportedException(String message, Throwable ex) {
	super(message,ex);
  }
  
  public HTTPVersionNotSupportedException(Throwable ex) {
    super(ex);
  }

}
