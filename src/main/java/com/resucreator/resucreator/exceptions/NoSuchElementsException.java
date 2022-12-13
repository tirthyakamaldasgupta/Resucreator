package com.resucreator.resucreator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoSuchElementsException extends RuntimeException {
    public NoSuchElementsException(String message) {
        super(message);
    }
}
