package com.example.demo.myapplication.networkinterfaces;

import jakarta.persistence.*; // Import for JPA annotations

/**
 * Entity class representing a Network Interface.
 * Mapped to the "network_interfaces" table in the database.
 */
@Entity
@Table(name = "network_interfaces")
public class NetworkInterface {

    // Primary key for the network_interfaces table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented ID
    @Column(name = "interface_id") // Maps to the "interface_id" column
    private Long interfaceId;

    // Foreign key referring to the associated network device
    @Column(name = "device_id") // Maps to the "device_id" column
    private Long deviceId;

    // Name of the network interface
    @Column(name = "interface_name") // Maps to the "interface_name" column
    private String interfaceName;

    // Type of the network interface (e.g., Ethernet, Wireless)
    @Column(name = "interface_type") // Maps to the "interface_type" column
    private String interfaceType;

    // Speed of the network interface in Mbps
    @Column(name = "speed_mbps") // Maps to the "speed_mbps" column
    private Integer speedMbps;

    // MAC address of the network interface
    @Column(name = "mac_address") // Maps to the "mac_address" column
    private String macAddress;

    /**
     * Default constructor for JPA.
     */
    public NetworkInterface() {
    }

    /**
     * Parameterized constructor for initializing a NetworkInterface instance.
     *
     * @param interfaceId   The unique ID of the network interface.
     * @param deviceId      The ID of the device to which the interface belongs.
     * @param interfaceName The name of the network interface.
     * @param interfaceType The type of the network interface.
     * @param speedMbps     The speed of the network interface in Mbps.
     * @param macAddress    The MAC address of the network interface.
     */
    public NetworkInterface(Long interfaceId, Long deviceId, String interfaceName, String interfaceType, Integer speedMbps, String macAddress) {
        this.interfaceId = interfaceId;
        this.deviceId = deviceId;
        this.interfaceName = interfaceName;
        this.interfaceType = interfaceType;
        this.speedMbps = speedMbps;
        this.macAddress = macAddress;
    }

    // Getters and setters

    /**
     * Gets the unique ID of the network interface.
     *
     * @return The interface ID.
     */
    public Long getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the unique ID of the network interface.
     *
     * @param interfaceId The interface ID to set.
     */
    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
    }

    /**
     * Gets the ID of the device to which the interface belongs.
     *
     * @return The device ID.
     */
    public Long getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the ID of the device to which the interface belongs.
     *
     * @param deviceId The device ID to set.
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * Gets the name of the network interface.
     *
     * @return The interface name.
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the name of the network interface.
     *
     * @param interfaceName The interface name to set.
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     * Gets the type of the network interface.
     *
     * @return The interface type.
     */
    public String getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the type of the network interface.
     *
     * @param interfaceType The interface type to set.
     */
    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    /**
     * Gets the speed of the network interface in Mbps.
     *
     * @return The speed in Mbps.
     */
    public Integer getSpeedMbps() {
        return speedMbps;
    }

    /**
     * Sets the speed of the network interface in Mbps.
     *
     * @param speedMbps The speed in Mbps to set.
     */
    public void setSpeedMbps(Integer speedMbps) {
        this.speedMbps = speedMbps;
    }

    /**
     * Gets the MAC address of the network interface.
     *
     * @return The MAC address.
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the MAC address of the network interface.
     *
     * @param macAddress The MAC address to set.
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}