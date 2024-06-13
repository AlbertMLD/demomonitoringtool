package com.example.demo.myapplication.networklogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/networklogs") // Base mapping for all endpoints in this controller
public class NetworkLogController {

    private final NetworkLogService networkLogService; // Service dependency for handling network logs

    @Autowired
    public NetworkLogController(NetworkLogService networkLogService) {
        this.networkLogService = networkLogService; // Injecting NetworkLogService dependency via constructor
    }

    // Handler method to retrieve all network logs and render them in a view
    @GetMapping
    public String getNetworkLogs(Model model) {
        List<NetworkLog> logs = networkLogService.getAllLogs(); // Fetching all network logs from the service
        model.addAttribute("logs", logs); // Adding logs to the model for rendering in the view
        return "networklogs"; // Returning the name of the Thymeleaf template to render
    }

    // Handler method to provide API endpoint for retrieving error messages
    @GetMapping("/api/error-messages")
    public List<String> getErrorMessages() {
        // Return sample error messages as a list
        return Arrays.asList("Device 1 is down", "Interface 2 has high traffic");
    }
}