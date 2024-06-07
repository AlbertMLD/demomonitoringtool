package com.example.demo.myapplication.networkinterfaces;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class NetworkInterfaceConfig {

    @Bean
    CommandLineRunner networkInterfaceCommandLineRunner (NetworkInterfaceRepository repository) {
        return args -> {
            NetworkInterface networkInterface1 = new NetworkInterface(
                    1L,
                    1L,
                    "Ethernet0",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:01"
            );

            NetworkInterface networkInterface2 = new NetworkInterface(
                    2L,
                    1L,
                    "Ethernet1",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:02"
            );

            NetworkInterface networkInterface3 = new NetworkInterface(
                    3L,
                    1L,
                    "Ethernet2",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:03"
            );

            NetworkInterface networkInterface4 = new NetworkInterface(
                    4L,
                    1L,
                    "WiFi0",
                    "WiFi",
                    300,
                    "AA:BB:CC:DD:EE:04"
            );

            NetworkInterface networkInterface5 = new NetworkInterface(
                    5L,
                    2L,
                    "Ethernet0",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:05"
            );

            NetworkInterface networkInterface6 = new NetworkInterface(
                    6L,
                    2L,
                    "Ethernet1",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:06"
            );

            NetworkInterface networkInterface7 = new NetworkInterface(
                    7L,
                    3L,
                    "Ethernet0",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:07"
            );

            NetworkInterface networkInterface8 = new NetworkInterface(
                    8L,
                    3L,
                    "WiFi0",
                    "WiFi",
                    300,
                    "AA:BB:CC:DD:EE:08"
            );

            NetworkInterface networkInterface9 = new NetworkInterface(
                    9L,
                    4L,
                    "Ethernet0",
                    "Ethernet",
                    1000,
                    "AA:BB:CC:DD:EE:09"
            );

            NetworkInterface networkInterface10 = new NetworkInterface(
                    10L,
                    4L,
                    "WiFi0",
                    "WiFi",
                    300,
                    "AA:BB:CC:DD:EE:10"
            );

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
