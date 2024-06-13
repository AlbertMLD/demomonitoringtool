package com.example.demo.myapplication.networklogs;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice // Indicates that this class provides global exception handling for REST controllers
public class NetworkLogExceptionHandler {

    // Exception handler for MethodArgumentNotValidException, which occurs when validation on an argument annotated with @Valid fails
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) // Sets the HTTP response status to 400 Bad Request
    public Map<String, Object> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, Object> errors = new HashMap<>();
        errors.put("timestamp", LocalDateTime.now()); // Timestamp of the error
        errors.put("status", HttpStatus.BAD_REQUEST.value()); // HTTP status code
        errors.put("error", "Validation Error"); // Error type
        errors.put("message", "Input data validation failed"); // Error message

        Map<String, String> fieldErrors = new HashMap<>();
        // Gathering field errors and their respective error messages
        ex.getBindingResult().getFieldErrors().forEach(fieldError ->
                fieldErrors.put(fieldError.getField(), fieldError.getDefaultMessage()));
        errors.put("fieldErrors", fieldErrors); // Adding field errors to the response

        return errors; // Returning the constructed error response map
    }

    // Exception handler for NetworkLogNotFoundException, which is a custom exception for when a network log is not found
    @ExceptionHandler(NetworkLogNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND) // Sets the HTTP response status to 404 Not Found
    public Map<String, Object> handleNetworkLogNotFoundException(NetworkLogNotFoundException ex) {
        // Using a helper method to create a standardized error response
        return createErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage(), ex.getPath());
    }

    // Helper method to create a standardized error response map
    private Map<String, Object> createErrorResponse(HttpStatus status, String message, String path) {
        return Map.of(
                "timestamp", LocalDateTime.now(), // Timestamp of the error
                "status", status.value(), // HTTP status code
                "error", status.getReasonPhrase(), // Error type
                "message", message, // Error message
                "path", path // Path where the error occurred
        );
    }
}