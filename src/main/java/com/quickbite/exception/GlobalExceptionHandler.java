package com.quickbite.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.quickbite.exception.RestaurantNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ValidationErrorResponse handleValidationErrors(MethodArgumentNotValidException exception){

        Map<String, String> errors = new HashMap<>();

        exception.getBindingResult()
                .getFieldErrors()
                .forEach(error -> errors.put(error.getField(), error.getDefaultMessage())
                );

        return new ValidationErrorResponse(
                "Validation failed",
                errors
        );
    }

    @ExceptionHandler(RestaurantNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleRestaurantNotFound(
        RestaurantNotFoundException exception) {

        Map<String, String> body = new HashMap<>();
        body.put("message", exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
        }
}
