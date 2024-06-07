package com.example.demo.myapplication.networklogs;

public class NetworkLogNotFoundException extends RuntimeException {
    private final Long logId;
    private final String path;

    public NetworkLogNotFoundException(Long logId, String path) {
        super("Network log with ID " + logId + " not found.");
        this.logId = logId;
        this.path = path;
    }

    public Long getLogId() {
        return logId;
    }

    public String getPath() {
        return path;
    }
}