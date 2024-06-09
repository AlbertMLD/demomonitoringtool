package com.example.demo.myapplication.trafficalerts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class TrafficAlertPageController {

    @GetMapping("/traffic_alerts")
    public String showTrafficAlertsPage() {
        return "traffic_alerts"; // Aceasta corespunde cu traffic_alerts.html în directorul templates
    }

    @GetMapping("/dashboard")
    @ResponseBody
    public Map<String, Object> dashboard() {
        Random random = new Random();
        Map<String, Object> data = new HashMap<>();

        // Generate data for interface traffic
        int interfaceTrafficValue = random.nextInt(10000);
        data.put("interfaceTraffic", interfaceTrafficValue);

        return data; // Return data as JSON
    }

    @GetMapping("/interface-traffic-data")
    @ResponseBody
    public Map<String, Object> interfaceTrafficData() {
        // Generate interface traffic data
        Random random = new Random();
        Map<String, Object> data = new HashMap<>();
        int interfaceTrafficValue = random.nextInt(10000); // Generating a random value for interface traffic
        data.put("interfaceTraffic", interfaceTrafficValue);
        return data; // Return data as JSON
    }
}
