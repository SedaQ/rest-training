package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY, reason = "The requested resource already exists")
public class ResourceAlreadyExistingException extends RuntimeException {

  public ResourceAlreadyExistingException() {}

  public ResourceAlreadyExistingException(String message) {
    super(message);
  }

  public ResourceAlreadyExistingException(String message, Throwable ex) {
	super(message,ex);
  }
  
  public ResourceAlreadyExistingException(Throwable ex) {
    super(ex);
  }
}
