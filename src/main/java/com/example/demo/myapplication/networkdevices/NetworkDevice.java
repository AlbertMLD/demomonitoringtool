package com.example.demo.myapplication.networkdevices;

import java.time.LocalDateTime;  // Import for handling date and time

import jakarta.persistence.*;  // JPA annotations for ORM (Object-Relational Mapping)

/**
 * This class represents a network device entity mapped to the "network_devices" table in the database.
 * Each instance of this class corresponds to a row in the "network_devices" table.
 */
@Entity
@Table(name = "network_devices")
public class NetworkDevice {

    // Primary key for the network device entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id")
    private Long deviceId;

    // Field to store the ID of the administrator responsible for the device
    @Column(name = "administrator_id")
    private Integer administratorId;

    // Field to store the name of the device
    @Column(name = "device_name")
    private String deviceName;

    // Field to store the IP address of the device
    @Column(name = "device_ip_address")
    private String deviceIpAddress;

    // Field to store the type of the device (e.g., router, switch)
    @Column(name = "device_type")
    private String deviceType;

    // Field to store the location of the device
    @Column(name = "location")
    private String location;

    // Field to store the manufacturer of the device
    @Column(name = "manufacturer")
    private String manufacturer;

    // Field to store the firmware version of the device
    @Column(name = "firmware_version")
    private String firmwareVersion;

    // Field to store the operational status of the device (e.g., active, inactive)
    @Column(name = "status")
    private String status;

    // Field to store the last time the device was seen or reported
    @Column(name = "last_seen")
    private LocalDateTime lastSeen;

    // Default constructor (required by JPA)
    public NetworkDevice() {
    }

    /**
     * Parameterized constructor to initialize a NetworkDevice instance with specific values.
     *
     * @param administratorId ID of the administrator managing the device.
     * @param deviceName Name of the device.
     * @param deviceIpAddress IP address of the device.
     * @param deviceType Type of the device (e.g., router, switch).
     * @param location Location where the device is deployed.
     * @param manufacturer Manufacturer of the device.
     * @param firmwareVersion Firmware version installed on the device.
     * @param status Operational status of the device.
     * @param lastSeen The last time the device was seen or reported.
     */
    public NetworkDevice(Integer administratorId, String deviceName, String deviceIpAddress, String deviceType,
                         String location, String manufacturer, String firmwareVersion, String status, LocalDateTime lastSeen) {
        this.administratorId = administratorId;
        this.deviceName = deviceName;
        this.deviceIpAddress = deviceIpAddress;
        this.deviceType = deviceType;
        this.location = location;
        this.manufacturer = manufacturer;
        this.firmwareVersion = firmwareVersion;
        this.status = status;
        this.lastSeen = lastSeen;
    }

    // Getters and Setters for each field

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceIpAddress() {
        return deviceIpAddress;
    }

    public void setDeviceIpAddress(String deviceIpAddress) {
        this.deviceIpAddress = deviceIpAddress;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    // Override the toString method to provide a string representation of the NetworkDevice instance
    @Override
    public String toString() {
        return "NetworkDevice [deviceId=" + deviceId + ", administratorId=" + administratorId +
                ", deviceName=" + deviceName + ", deviceIpAddress=" + deviceIpAddress +
                ", deviceType=" + deviceType + ", location=" + location +
                ", manufacturer=" + manufacturer + ", firmwareVersion=" + firmwareVersion +
                ", status=" + status + ", lastSeen=" + lastSeen + "]";
    }
}