package com.example.demo.networkdevices;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkDeviceRepository extends JpaRepository<com.example.demo.networkdevices.NetworkDevice, Long> {

    Optional<com.example.demo.networkdevices.NetworkDevice> findNetworkDeviceByDeviceIpAddress(String deviceIpAddress);

}