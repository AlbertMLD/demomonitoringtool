/**
 * Created by ALUNGU2 on 05.06.2024 at 22:31.
 */
package com.example.demo.myapplication.networkinterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkInterfaceService {

    private final NetworkInterfaceRepository networkInterfaceRepository;

    @Autowired
    public NetworkInterfaceService(NetworkInterfaceRepository networkInterfaceRepository) {
        this.networkInterfaceRepository = networkInterfaceRepository;
    }

    public List<NetworkInterface> getAllNetworkInterfaces() {
        return networkInterfaceRepository.findAll();
    }

    public void addNewNetworkInterface(NetworkInterface networkInterface) {
        networkInterfaceRepository.save(networkInterface);
    }

    public void deleteNetworkInterface(Long interfaceId) {
        networkInterfaceRepository.deleteById(interfaceId);
    }
}
