package com.example.demo.myapplication.networklogs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class NetworkLogConfig {

    @Bean
    CommandLineRunner networkLogCommandLineRunner(NetworkLogRepository repository) {
        return args -> {
            NetworkLog log1 = new NetworkLog(1, 1, 1, LocalDateTime.now(), "Device started", "INFO", "192.168.1.1");
            NetworkLog log2 = new NetworkLog(2, 2, 2, LocalDateTime.now(), "Device stopped", "WARN", "192.168.1.2");
            NetworkLog log3 = new NetworkLog(3, 3, 3, LocalDateTime.now(), "Error in device", "ERROR", "192.168.1.3");

            repository.saveAll(List.of(log1, log2, log3));
        };
    }
}