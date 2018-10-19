package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.NOT_IMPLEMENTED,
    reason = "The server either does not recognize the request method, or it lacks the ability to fulfil the request. Usually this implies future availability (e.g., a new feature of a web-service API).")
public class NotImplementedException extends RuntimeException {

  public NotImplementedException() {}

  public NotImplementedException(String message) {
    super(message);
  }

  public NotImplementedException(String message, Throwable ex) {
	super(message,ex);
  }
  
  public NotImplementedException(Throwable ex) {
    super(ex);
  }

}
