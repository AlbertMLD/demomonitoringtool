package com.example.demo.networkdevices;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NetworkDeviceConfig {

    @Bean
    CommandLineRunner commandLineRunner(NetworkDeviceRepository repository) {
        return args -> {
            NetworkDevice device1 = new NetworkDevice(
                    1,
                    "Router1",
                    "192.168.1.1",
                    "Router",
                    "Main Office",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            NetworkDevice device2 = new NetworkDevice(
                    2,
                    "Switch1",
                    "192.168.1.2",
                    "Switch",
                    "Main Office",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            // Add more devices here
            NetworkDevice device3 = new NetworkDevice(
                    3,
                    "Router2",
                    "192.168.1.3",
                    "Router",
                    "Branch Office",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            NetworkDevice device4 = new NetworkDevice(
                    4,
                    "Switch2",
                    "192.168.1.4",
                    "Switch",
                    "Branch Office",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            NetworkDevice device5 = new NetworkDevice(
                    5,
                    "Router3",
                    "192.168.1.5",
                    "Router",
                    "Data Center",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            NetworkDevice device6 = new NetworkDevice(
                    6,
                    "Switch3",
                    "192.168.1.6",
                    "Switch",
                    "Data Center",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            NetworkDevice device7 = new NetworkDevice(
                    7,
                    "Router4",
                    "192.168.1.7",
                    "Router",
                    "Remote Office",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            NetworkDevice device8 = new NetworkDevice(
                    8,
                    "Switch4",
                    "192.168.1.8",
                    "Switch",
                    "Remote Office",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            NetworkDevice device9 = new NetworkDevice(
                    9,
                    "Firewall1",
                    "192.168.1.9",
                    "Firewall",
                    "Main Office",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            NetworkDevice device10 = new NetworkDevice(
                    10,
                    "Firewall2",
                    "192.168.1.10",
                    "Firewall",
                    "Data Center",
                    "Cisco",
                    "v1.0",
                    "Active",
                    LocalDateTime.now()
            );

            repository.saveAll(List.of(device1, device2, device3, device4, device5, device6, device7, device8, device9, device10));
        };
    }
}