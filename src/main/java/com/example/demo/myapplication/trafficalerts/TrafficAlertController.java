package com.example.demo.myapplication.trafficalerts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrafficAlertController {

    private final TrafficAlertService trafficAlertService;

    @Autowired
    public TrafficAlertController(TrafficAlertService trafficAlertService) {
        this.trafficAlertService = trafficAlertService;
    }

    /**
     * Endpoint to fetch all traffic alerts.
     *
     * @return List of TrafficAlert objects representing all traffic alerts
     */
    @GetMapping("/api/traffic-alerts")
    public List<TrafficAlert> getTrafficAlerts() {
        return trafficAlertService.getAllTrafficAlerts();
    }

}
