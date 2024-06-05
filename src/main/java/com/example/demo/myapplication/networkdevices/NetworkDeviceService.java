package com.example.demo.myapplication.networkdevices;

import java.util.List;
import java.util.Optional;

import com.example.demo.myapplication.networkdevices.NetworkDevice;
import com.example.demo.myapplication.networkdevices.NetworkDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetworkDeviceService {

    private final NetworkDeviceRepository networkDeviceRepository;

    @Autowired
    public NetworkDeviceService(NetworkDeviceRepository networkDeviceRepository) {
        this.networkDeviceRepository = networkDeviceRepository;
    }

    public List<NetworkDevice> getNetworkDevices() {
        return networkDeviceRepository.findAll();
    }

    public void addNewNetworkDevice(NetworkDevice networkDevice) {
        Optional<NetworkDevice> networkDeviceByIpAddressOptional =
                networkDeviceRepository.findNetworkDeviceByDeviceIpAddress(networkDevice.getDeviceIpAddress());

        if (networkDeviceByIpAddressOptional.isPresent()) {
            throw new IllegalStateException("IP Address already exists");
        }

        networkDeviceRepository.save(networkDevice);
    }

    public void deleteNetworkDevice(Long deviceId) {
        boolean exists = networkDeviceRepository.existsById(deviceId);
        if (!exists) {
            throw new IllegalStateException("Device with id " + deviceId + " does not exist");
        }
        networkDeviceRepository.deleteById(deviceId);
    }
}