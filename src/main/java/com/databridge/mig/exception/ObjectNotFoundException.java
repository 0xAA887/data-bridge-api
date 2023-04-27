package com.databridge.mig.exception;

/**
 * Called when object not found
 * @author Migx3
 */
public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
