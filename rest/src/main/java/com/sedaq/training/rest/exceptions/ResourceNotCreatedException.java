package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda (441048)
 *
 */
@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason = "The requested resource was not created")
public class ResourceNotCreatedException extends RuntimeException {

  public ResourceNotCreatedException() {}

  public ResourceNotCreatedException(String message) {
    super(message);
  }
  
  public ResourceNotCreatedException(String message, Throwable ex) {
	super(message,ex);
  }

  public ResourceNotCreatedException(Throwable ex) {
    super(ex);
  }

}
