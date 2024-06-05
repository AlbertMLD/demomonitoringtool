package com.example.demo.myapplication.networkdevices;

import java.util.Optional;

import com.example.demo.myapplication.networkdevices.NetworkDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkDeviceRepository extends JpaRepository<NetworkDevice, Long> {

    Optional<NetworkDevice> findNetworkDeviceByDeviceIpAddress(String deviceIpAddress);

}