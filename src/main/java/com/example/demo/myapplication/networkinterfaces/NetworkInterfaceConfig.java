package com.example.demo.myapplication.networkinterfaces;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Configuration class for initializing network interface data.
 */
@Configuration
public class NetworkInterfaceConfig {

    /**
     * CommandLineRunner bean that runs on application startup to initialize the database
     * with a set of predefined network interface records.
     *
     * @param repository The repository used to save the network interfaces to the database.
     * @return A CommandLineRunner that saves a list of network interfaces to the repository.
     */
    @Bean
    CommandLineRunner networkInterfaceCommandLineRunner(NetworkInterfaceRepository repository) {
        return args -> {
            // Creating sample network interface records

            // NetworkInterface 1
            NetworkInterface networkInterface1 = new NetworkInterface(
                    1L,                 // Interface ID
                    1L,                 // Associated Device ID
                    "Ethernet0",        // Interface Name
                    "Ethernet",         // Interface Type
                    1000,               // Speed in Mbps
                    "AA:BB:CC:DD:EE:01" // MAC Address
            );

            // NetworkInterface 2
            NetworkInterface networkInterface2 = new NetworkInterface(
                    2L,
                    1L,
                    "Ethernet1",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:02"
            );

            // NetworkInterface 3
            NetworkInterface networkInterface3 = new NetworkInterface(
                    3L,
                    1L,
                    "Ethernet2",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:03"
            );

            // NetworkInterface 4
            NetworkInterface networkInterface4 = new NetworkInterface(
                    4L,
                    1L,
                    "WiFi0",
                    "WiFi",
                    300,
                    "AA:BB:CC:DD:EE:04"
            );

            // NetworkInterface 5
            NetworkInterface networkInterface5 = new NetworkInterface(
                    5L,
                    2L,
                    "Ethernet0",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:05"
            );

            // NetworkInterface 6
            NetworkInterface networkInterface6 = new NetworkInterface(
                    6L,
                    2L,
                    "Ethernet1",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:06"
            );

            // NetworkInterface 7
            NetworkInterface networkInterface7 = new NetworkInterface(
                    7L,
                    3L,
                    "Ethernet0",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:07"
            );

            // NetworkInterface 8
            NetworkInterface networkInterface8 = new NetworkInterface(
                    8L,
                    3L,
                    "WiFi0",
                    "WiFi",
                    300,
                    "AA:BB:CC:DD:EE:08"
            );

            // NetworkInterface 9
            NetworkInterface networkInterface9 = new NetworkInterface(
                    9L,
                    4L,
                    "Ethernet0",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:09"
            );

            // NetworkInterface 10
            NetworkInterface networkInterface10 = new NetworkInterface(
                    10L,
                    4L,
                    "WiFi0",
                    "WiFi",
                    300,
                    "AA:BB:CC:DD:EE:10"
            );

            // Saving all the created network interface records to the repository
            repository.saveAll(List.of(
                    networkInterface1,
                    networkInterface2,
                    networkInterface3,
                    networkInterface4,
                    networkInterface5,
                    networkInterface6,
                    networkInterface7,
                    networkInterface8,
                    networkInterface9,
                    networkInterface10
            ));
        };
    }
}