package com.example.demo.myapplication.networklogs;

// Extending RuntimeException to indicate that this is an unchecked exception
public class NetworkLogNotFoundException extends RuntimeException {

    private final Long logId; // ID of the network log that was not found
    private final String path; // Path or endpoint where the exception occurred

    // Constructor that takes logId and path as parameters
    public NetworkLogNotFoundException(Long logId, String path) {
        // Calling the constructor of RuntimeException with a formatted error message
        super("Network log with ID " + logId + " not found.");
        this.logId = logId; // Initializing logId field
        this.path = path; // Initializing path field
    }

    // Getter for logId
    public Long getLogId() {
        return logId;
    }

    // Getter for path
    public String getPath() {
        return path;
    }
}