package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE,
    reason = "The client has asked for a portion of the file (byte serving), but the server cannot supply that portion. For example, if the client asked for a part of the file that lies beyond the end of the file.")
public class RangeNotSatisfiableException extends RuntimeException {

  public RangeNotSatisfiableException() {}

  public RangeNotSatisfiableException(String message) {
    super(message);
  }

  public RangeNotSatisfiableException(String message, Throwable ex) {
	super(message,ex);
  }
  
  public RangeNotSatisfiableException(Throwable ex) {
    super(ex);
  }

}
