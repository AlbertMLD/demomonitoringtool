package com.example.demo.myapplication.networklogs;

import jakarta.persistence.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

/**
 * Entity class representing network log entries stored in the database.
 */
@Entity
@Table(name = "network_logs")
public class NetworkLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @NotNull
    private Integer deviceId;

    @NotNull
    private Integer administratorId;

    @NotNull
    private Integer interfaceId;

    @NotNull
    private LocalDateTime timestamp;

    @NotEmpty
    @Size(max = 255)
    private String logMessage;

    @NotEmpty
    @Pattern(regexp = "INFO|WARN|ERROR")
    private String logLevel;

    @NotEmpty
    @Pattern(regexp = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")
    private String sourceIp;

    // Constructors
    public NetworkLog() {}

    public NetworkLog(Integer deviceId, Integer administratorId, Integer interfaceId, LocalDateTime timestamp,
                      String logMessage, String logLevel, String sourceIp) {
        this.deviceId = deviceId;
        this.administratorId = administratorId;
        this.interfaceId = interfaceId;
        this.timestamp = timestamp;
        this.logMessage = logMessage;
        this.logLevel = logLevel;
        this.sourceIp = sourceIp;
    }

    // Getters and Setters
    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public Integer getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Integer interfaceId) {
        this.interfaceId = interfaceId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }
}