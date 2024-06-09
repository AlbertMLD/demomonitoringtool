package com.example.demo.myapplication.networkdevices;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "network_devices")
public class NetworkDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id")
    private Long deviceId;

    @Column(name = "administrator_id")
    private Integer administratorId;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "device_ip_address")
    private String deviceIpAddress;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "location")
    private String location;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "firmware_version")
    private String firmwareVersion;

    @Column(name = "status")
    private String status;

    @Column(name = "last_seen")
    private LocalDateTime lastSeen;

    // Constructors, getters, and setters
    public NetworkDevice() {
    }

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

    public Long getDeviceId() {
        return deviceId;
    }

    public Integer getAdministratorId() {
        return administratorId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDeviceIpAddress() {
        return deviceIpAddress;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getLocation() {
        return location;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDeviceIpAddress(String deviceIpAddress) {
        this.deviceIpAddress = deviceIpAddress;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Override
    public String toString() {
        return "NetworkDevice [deviceId=" + deviceId + ", deviceName=" + deviceName + ", deviceIpAddress=" + deviceIpAddress
                + ", deviceType=" + deviceType + ", location=" + location + ", manufacturer=" + manufacturer
                + ", firmwareVersion=" + firmwareVersion + ", status=" + status + ", lastSeen=" + lastSeen + "]";
    }

}