package com.example.demo.myapplication.networkdevices;

import java.util.List; // Import for List collection
import java.util.Optional; // Import for Optional type

import org.springframework.beans.factory.annotation.Autowired; // Import for dependency injection annotation
import org.springframework.stereotype.Service; // Import for marking the class as a service layer component

/**
 * Service class for managing NetworkDevice entities.
 * Provides business logic and interacts with the NetworkDeviceRepository.
 */
@Service
public class NetworkDeviceService {

    // Repository to interact with the database
    private final NetworkDeviceRepository networkDeviceRepository;

    /**
     * Constructor to inject NetworkDeviceRepository dependency.
     *
     * @param networkDeviceRepository Repository for network devices.
     */
    @Autowired
    public NetworkDeviceService(NetworkDeviceRepository networkDeviceRepository) {
        this.networkDeviceRepository = networkDeviceRepository;
    }

    /**
     * Retrieve all network devices from the database.
     *
     * @return A list of all NetworkDevice objects.
     */
    public List<NetworkDevice> getNetworkDevices() {
        return networkDeviceRepository.findAll(); // Fetch all network devices from the repository
    }

    /**
     * Add a new network device to the database.
     *
     * @param networkDevice The NetworkDevice object to be added.
     */
    public void addNewNetworkDevice(NetworkDevice networkDevice) {
        // Check if a device with the same IP address already exists
        Optional<NetworkDevice> networkDeviceByIpAddressOptional =
                networkDeviceRepository.findNetworkDeviceByDeviceIpAddress(networkDevice.getDeviceIpAddress());

        // If a device with the given IP address exists, throw an exception
        if (networkDeviceByIpAddressOptional.isPresent()) {
            throw new IllegalStateException("IP Address already exists");
        }

        // Save the new network device to the database
        networkDeviceRepository.save(networkDevice);
    }

    /**
     * Delete a network device from the database by its ID.
     *
     * @param deviceId The ID of the NetworkDevice to be deleted.
     */
    public void deleteNetworkDevice(Long deviceId) {
        // Check if a device with the given ID exists
        boolean exists = networkDeviceRepository.existsById(deviceId);
        if (!exists) {
            // If the device does not exist, throw an exception
            throw new IllegalStateException("Device with id " + deviceId + " does not exist");
        }
        // Delete the network device by its ID
        networkDeviceRepository.deleteById(deviceId);
    }
}