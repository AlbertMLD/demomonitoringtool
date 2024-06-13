package com.example.demo.myapplication.networkinterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for business logic related to NetworkInterface entities.
 */
@Service
public class NetworkInterfaceService {

    private final NetworkInterfaceRepository networkInterfaceRepository;

    /**
     * Constructor-based dependency injection for NetworkInterfaceRepository.
     *
     * @param networkInterfaceRepository The repository used to perform CRUD operations on NetworkInterface entities.
     */
    @Autowired
    public NetworkInterfaceService(NetworkInterfaceRepository networkInterfaceRepository) {
        this.networkInterfaceRepository = networkInterfaceRepository;
    }

    /**
     * Retrieves all NetworkInterface entities from the repository.
     *
     * @return A list of all NetworkInterface entities currently stored in the database.
     */
    public List<NetworkInterface> getAllNetworkInterfaces() {
        return networkInterfaceRepository.findAll();
    }
}