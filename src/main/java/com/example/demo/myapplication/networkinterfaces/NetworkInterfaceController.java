package com.example.demo.myapplication.networkinterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Controller class for handling network interface related HTTP requests.
 */
@Controller
public class NetworkInterfaceController {

    private final NetworkInterfaceService networkInterfaceService;

    /**
     * Constructor-based dependency injection for NetworkInterfaceService.
     *
     * @param networkInterfaceService The service responsible for business logic related to network interfaces.
     */
    @Autowired
    public NetworkInterfaceController(NetworkInterfaceService networkInterfaceService) {
        this.networkInterfaceService = networkInterfaceService;
    }

    /**
     * GET request handler for "/networkinterfaces" endpoint.
     * Retrieves all network interfaces from the service layer and adds them to the model for rendering.
     *
     * @param model The Spring MVC model object to which attributes are added.
     * @return The name of the Thymeleaf template (HTML view) to be rendered.
     */
    @GetMapping("/networkinterfaces")
    public String showNetworkInterfaces(Model model) {
        // Get all network interfaces from the service layer
        List<NetworkInterface> interfaces = networkInterfaceService.getAllNetworkInterfaces();

        // Add the list of interfaces to the model attribute
        model.addAttribute("interfaces", interfaces);

        // Return the name of the Thymeleaf template (HTML view) to render
        return "networkinterfaces";
    }
}