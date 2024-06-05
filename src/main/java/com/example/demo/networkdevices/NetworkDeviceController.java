package com.example.demo.networkdevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/network-devices")
public class NetworkDeviceController {

    private final NetworkDeviceService networkDeviceService;

    @Autowired
    public NetworkDeviceController(NetworkDeviceService networkDeviceService) {
        this.networkDeviceService = networkDeviceService;
    }

    @GetMapping
    public List<NetworkDevice> getAllNetworkDevices() {
        return networkDeviceService.getNetworkDevices();
    }

    @PostMapping
    public void registerNewNetworkDevice(@RequestBody NetworkDevice networkDevice) {
        networkDeviceService.addNewNetworkDevice(networkDevice);
    }

    @DeleteMapping(path = "{deviceId}")
    public void deleteNetworkDevice(@PathVariable("deviceId") Long deviceId) {
        networkDeviceService.deleteNetworkDevice(deviceId);
    }
}