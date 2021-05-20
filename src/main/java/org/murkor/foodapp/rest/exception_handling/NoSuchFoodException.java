package org.murkor.foodapp.rest.exception_handling;

public class NoSuchFoodException extends RuntimeException {
    public NoSuchFoodException(String message) {
        super(message);
    }
}
