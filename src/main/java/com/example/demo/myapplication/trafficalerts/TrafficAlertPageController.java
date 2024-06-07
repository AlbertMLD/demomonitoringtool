package com.example.demo.myapplication.trafficalerts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrafficAlertPageController {

    @GetMapping("/traffic_alerts")
    public String showTrafficAlertsPage() {
        return "traffic_alerts"; // This corresponds to traffic_alerts.html in the templates directory
    }
}