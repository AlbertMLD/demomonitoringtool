package com.example.demo.myapplication.networkdevices;

import org.springframework.stereotype.Controller; // Import for Spring MVC Controller annotation
import org.springframework.ui.Model; // Import for passing data to the view
import org.springframework.web.bind.annotation.GetMapping; // Import for handling HTTP GET requests

/**
 * Controller class to handle requests related to Network Devices.
 * This class is part of the web layer in the Spring MVC architecture.
 */
@Controller
public class NetworkDeviceController {

    // Service layer dependency for handling business logic related to Network Devices
    private final NetworkDeviceService networkDeviceService;

    /**
     * Constructor injection to initialize NetworkDeviceService.
     *
     * @param networkDeviceService Service to manage network devices.
     */
    public NetworkDeviceController(NetworkDeviceService networkDeviceService) {
        this.networkDeviceService = networkDeviceService;
    }

    /**
     * Handles GET requests to "/networkdevices".
     * Fetches all network devices and adds them to the model to be displayed on the view.
     *
     * @param model Model object to pass data to the view.
     * @return The name of the view template to be rendered, "networkdevices".
     */
    @GetMapping("/networkdevices")
    public String getAllNetworkDevices(Model model) {
        // Add the list of network devices to the model with the attribute name "devices"
        model.addAttribute("devices", networkDeviceService.getNetworkDevices());
        // Return the view name "networkdevices" to be rendered
        return "networkdevices";
    }
}