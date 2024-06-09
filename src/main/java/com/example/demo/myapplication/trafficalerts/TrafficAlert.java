package com.example.demo.myapplication.trafficalerts;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "traffic_alerts")
public class TrafficAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;

    private Integer administratorId;
    private Integer interfaceId;
    private String interfaceName;
    private String alertType;

    @Column(name = "timestamp", columnDefinition = "TIMESTAMP")
    private LocalDateTime timestamp;

    // Default constructor (required by JPA)
    public TrafficAlert() {}

    // Constructor with parameters (excluding alertId since it is auto-generated)
    public TrafficAlert(Integer administratorId, Integer interfaceId, String interfaceName, String alertType, LocalDateTime timestamp) {
        this.administratorId = administratorId;
        this.interfaceId = interfaceId;
        this.interfaceName = interfaceName;
        this.alertType = alertType;
        this.timestamp = timestamp;
    }

    // Getters and Setters

    public Long getAlertId() {
        return alertId;
    }

    public void setAlertId(Long alertId) {
        this.alertId = alertId;
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

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}