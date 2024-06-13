package com.example.demo.myapplication.networkdevices;

import java.util.Optional; // Import for Optional type

import org.springframework.data.jpa.repository.JpaRepository; // Import for JPA repository interface
import org.springframework.stereotype.Repository; // Import for Repository annotation

/**
 * Repository interface for NetworkDevice entity.
 * Extends JpaRepository to provide CRUD operations on NetworkDevice objects.
 */
@Repository
public interface NetworkDeviceRepository extends JpaRepository<NetworkDevice, Long> {

    /**
     * Custom method to find a NetworkDevice by its IP address.
     *
     * @param deviceIpAddress The IP address of the network device to find.
     * @return An Optional containing the found NetworkDevice, or empty if not found.
     */
    Optional<NetworkDevice> findNetworkDeviceByDeviceIpAddress(String deviceIpAddress);

}