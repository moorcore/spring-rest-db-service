package org.murkor.foodapp.rest.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FoodGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<FoodIncorrectData> handleException(NoSuchFoodException exception) {
        FoodIncorrectData data = new FoodIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<FoodIncorrectData> handleException(Exception exception) {
        FoodIncorrectData data = new FoodIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
}
