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

            repository.saveAll(List.of(device1, device2));
        };
    }
}