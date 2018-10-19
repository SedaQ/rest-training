package com.sedaq.training.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Pavel Šeda
 *
 */
@ResponseStatus(value = HttpStatus.GATEWAY_TIMEOUT,
    reason = "The server was acting as a gateway or proxy and did not receive a timely response from the upstream server.")
public class GatewayTimeoutException extends RuntimeException {

  public GatewayTimeoutException() {}

  public GatewayTimeoutException(String message) {
    super(message);
  }

  public GatewayTimeoutException(String message, Throwable ex) {
    super(message, ex);
  }

  public GatewayTimeoutException(Throwable ex) {
    super(ex);
  }

}
