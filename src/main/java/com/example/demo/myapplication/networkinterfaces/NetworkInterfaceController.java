package com.example.demo.myapplication.networkinterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NetworkInterfaceController {

    private final NetworkInterfaceService networkInterfaceService;

    @Autowired
    public NetworkInterfaceController(NetworkInterfaceService networkInterfaceService) {
        this.networkInterfaceService = networkInterfaceService;
    }

    @GetMapping("/networkinterfaces")
    public String showNetworkInterfaces(Model model) {
        List<NetworkInterface> interfaces = networkInterfaceService.getAllNetworkInterfaces();
        model.addAttribute("interfaces", interfaces);
        return "networkinterfaces";
    }
}
