package com.example.demo.myapplication.networkinterfaces;

import jakarta.persistence.*;

@Entity
@Table(name = "network_interfaces")
public class NetworkInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interface_id")
    private Long interfaceId;

    @Column(name = "device_id")
    private Long deviceId;

    @Column(name = "interface_name")
    private String interfaceName;

    @Column(name = "interface_type")
    private String interfaceType;

    @Column(name = "speed_mbps")
    private Integer speedMbps;

    @Column(name = "mac_address")
    private String macAddress;

    // Constructors
    public NetworkInterface() {
    }

    public NetworkInterface(Long interfaceId, Long deviceId, String interfaceName, String interfaceType, Integer speedMbps, String macAddress) {
        this.interfaceId = interfaceId;
        this.deviceId = deviceId;
        this.interfaceName = interfaceName;
        this.interfaceType = interfaceType;
        this.speedMbps = speedMbps;
        this.macAddress = macAddress;
    }

    // Getters and setters
    public Long getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public Integer getSpeedMbps() {
        return speedMbps;
    }

    public void setSpeedMbps(Integer speedMbps) {
        this.speedMbps = speedMbps;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}