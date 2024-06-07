package com.example.demo.myapplication.networkinterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/network-interfaces")
public class NetworkInterfaceController {

    private final NetworkInterfaceService networkInterfaceService;

    @Autowired
    public NetworkInterfaceController(NetworkInterfaceService networkInterfaceService) {
        this.networkInterfaceService = networkInterfaceService;
    }

    @GetMapping("/networkinterfaces")
    public List<NetworkInterface> getAllNetworkInterfaces() {
        return networkInterfaceService.getAllNetworkInterfaces();
    }

    @PostMapping
    public void registerNewNetworkInterface(@RequestBody NetworkInterface networkInterface) {
        networkInterfaceService.addNewNetworkInterface(networkInterface);
    }

    @DeleteMapping(path = "{interfaceId}")
    public void deleteNetworkInterface(@PathVariable("interfaceId") Long interfaceId) {
        networkInterfaceService.deleteNetworkInterface(interfaceId);
    }
}
