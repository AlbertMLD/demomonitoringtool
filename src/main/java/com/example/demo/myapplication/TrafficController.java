package com.example.demo.myapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrafficController {

    @GetMapping("/traffic-data")
    public String getTrafficData() {
        // Logic to fetch traffic data
        return "Traffic data";
    }

    @GetMapping("/device-status")
    public String getDeviceStatus() {
        // Logic to fetch device status
        return "Device status";
    }

    @GetMapping("/traffic-alerts")
    public String getTrafficAlerts() {
        // Logic to fetch traffic alerts
        return "Traffic alerts";
    }
}
