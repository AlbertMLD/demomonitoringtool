package com.example.demo.myapplication.networkdevices;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NetworkDeviceController {

    private final NetworkDeviceService networkDeviceService;

    public NetworkDeviceController(NetworkDeviceService networkDeviceService) {
        this.networkDeviceService = networkDeviceService;
    }

    @GetMapping("/networkdevices")
    public String getAllNetworkDevices(Model model) {
        model.addAttribute("devices", networkDeviceService.getNetworkDevices());
        return "networkdevices";
    }
}