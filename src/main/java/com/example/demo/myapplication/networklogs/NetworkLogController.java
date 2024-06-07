package com.example.demo.myapplication.networklogs;

import com.example.demo.myapplication.networklogs.NetworkLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/networklogs")
public class NetworkLogController {

    private final NetworkLogService networkLogService;

    @Autowired
    public NetworkLogController(NetworkLogService networkLogService) {
        this.networkLogService = networkLogService;
    }

    @GetMapping
    public String getNetworkLogs(Model model) {
        List<NetworkLog> logs = networkLogService.getAllLogs();
        model.addAttribute("logs", logs);
        return "networklogs"; // Assuming "networklogs" is a Thymeleaf template
    }

    @GetMapping("/api/error-messages")
    public List<String> getErrorMessages() {
        return Arrays.asList("Device 1 is down", "Interface 2 has high traffic");
    }
}