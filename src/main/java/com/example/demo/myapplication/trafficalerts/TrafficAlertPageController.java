package com.example.demo.myapplication.trafficalerts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class TrafficAlertPageController {

    /**
     * Handler method for displaying the traffic alerts page.
     *
     * @return String representing the view name "traffic_alerts"
     */
    @GetMapping("/traffic_alerts")
    public String showTrafficAlertsPage() {
        return "traffic_alerts"; // This corresponds to traffic_alerts.html in the templates directory
    }

    /**
     * Endpoint to provide dashboard data.
     *
     * @return Map containing dashboard data (interfaceTraffic value)
     */
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

    /**
     * Endpoint to provide interface traffic data.
     *
     * @return Map containing interface traffic data (interfaceTraffic value)
     */
    @GetMapping("/interface-traffic-data")
    @ResponseBody
    public Map<String, Object> interfaceTrafficData() {
        Random random = new Random();
        Map<String, Object> data = new HashMap<>();

        // Generate interface traffic data
        int interfaceTrafficValue = random.nextInt(10000); // Generating a random value for interface traffic
        data.put("interfaceTraffic", interfaceTrafficValue);

        return data; // Return data as JSON
    }
}