package com.space.exception;

/**
 * @author Ruslan Tanas { @literal <skyuser13@gmail.com>}
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ShipNotFoundException extends RuntimeException {
    public ShipNotFoundException() {
        super("NOTFOUND");
    }
}
