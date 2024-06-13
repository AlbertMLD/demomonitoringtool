package com.example.demo.myapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrafficController {

    /**
     * Retrieves traffic data.
     *
     * @return String representing traffic data
     */
    @GetMapping("/traffic-data")
    public String getTrafficData() {
        // Logic to fetch traffic data
        return "Traffic data";
    }

    /**
     * Retrieves device status.
     *
     * @return String representing device status
     */
    @GetMapping("/device-status")
    public String getDeviceStatus() {
        // Logic to fetch device status
        return "Device status";
    }

    /**
     * Retrieves traffic alerts.
     *
     * @return String representing traffic alerts
     */
    @GetMapping("/traffic-alerts")
    public String getTrafficAlerts() {
        // Logic to fetch traffic alerts
        return "Traffic alerts";
    }
}