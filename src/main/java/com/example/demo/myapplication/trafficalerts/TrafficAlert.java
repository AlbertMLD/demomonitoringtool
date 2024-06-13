package com.example.demo.myapplication.trafficalerts;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "traffic_alerts")
public class TrafficAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;

    // Administrator ID associated with the traffic alert
    private Integer administratorId;

    // Interface ID associated with the traffic alert
    private Integer interfaceId;

    // Name of the network interface associated with the traffic alert
    private String interfaceName;

    // Type of the traffic alert (e.g., warning, error)
    private String alertType;

    // Timestamp of when the traffic alert occurred
    @Column(name = "timestamp", columnDefinition = "TIMESTAMP")
    private LocalDateTime timestamp;

    // Default constructor (required by JPA)
    public TrafficAlert() {}

    /**
     * Constructor to initialize TrafficAlert object with all attributes except alertId.
     *
     * @param administratorId ID of the administrator associated with the alert
     * @param interfaceId     ID of the network interface associated with the alert
     * @param interfaceName   Name of the network interface associated with the alert
     * @param alertType       Type of the alert (e.g., INFO, WARN, ERROR)
     * @param timestamp       Timestamp when the alert occurred
     */
    public TrafficAlert(Integer administratorId, Integer interfaceId, String interfaceName, String alertType, LocalDateTime timestamp) {
        this.administratorId = administratorId;
        this.interfaceId = interfaceId;
        this.interfaceName = interfaceName;
        this.alertType = alertType;
        this.timestamp = timestamp;
    }

    // Getters and Setters

    /**
     * Retrieves the alert ID.
     *
     * @return The alert ID
     */
    public Long getAlertId() {
        return alertId;
    }

    /**
     * Sets the alert ID.
     *
     * @param alertId The alert ID to set
     */
    public void setAlertId(Long alertId) {
        this.alertId = alertId;
    }

    /**
     * Retrieves the administrator ID associated with the alert.
     *
     * @return The administrator ID
     */
    public Integer getAdministratorId() {
        return administratorId;
    }

    /**
     * Sets the administrator ID associated with the alert.
     *
     * @param administratorId The administrator ID to set
     */
    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * Retrieves the interface ID associated with the alert.
     *
     * @return The interface ID
     */
    public Integer getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the interface ID associated with the alert.
     *
     * @param interfaceId The interface ID to set
     */
    public void setInterfaceId(Integer interfaceId) {
        this.interfaceId = interfaceId;
    }

    /**
     * Retrieves the name of the network interface associated with the alert.
     *
     * @return The interface name
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the name of the network interface associated with the alert.
     *
     * @param interfaceName The interface name to set
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     * Retrieves the type of the traffic alert.
     *
     * @return The alert type
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     * Sets the type of the traffic alert.
     *
     * @param alertType The alert type to set
     */
    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    /**
     * Retrieves the timestamp when the traffic alert occurred.
     *
     * @return The timestamp of the alert
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp when the traffic alert occurred.
     *
     * @param timestamp The timestamp of the alert to set
     */
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}