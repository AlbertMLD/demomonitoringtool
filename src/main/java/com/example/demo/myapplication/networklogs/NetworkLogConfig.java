package com.example.demo.myapplication.networklogs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Configuration class to initialize sample network log entries on application startup.
 */
@Configuration
public class NetworkLogConfig {

    /**
     * CommandLineRunner bean to execute code on application startup.
     * This bean initializes sample network log entries in the database.
     *
     * @param repository NetworkLogRepository instance to save log entries.
     * @return CommandLineRunner instance.
     */
    @Bean
    CommandLineRunner networkLogCommandLineRunner(NetworkLogRepository repository) {
        return args -> {
            // Creating sample network log entries
            NetworkLog log1 = new NetworkLog(1, 1, 1, LocalDateTime.now(), "Device started", "INFO", "192.168.1.1");
            NetworkLog log2 = new NetworkLog(2, 2, 2, LocalDateTime.now(), "Device stopped", "WARN", "192.168.1.2");
            NetworkLog log3 = new NetworkLog(3, 3, 3, LocalDateTime.now(), "Error in device", "ERROR", "192.168.1.3");
            NetworkLog log4 = new NetworkLog(4, 4, 4, LocalDateTime.now(), "Device restarted", "INFO", "192.168.1.4");
            NetworkLog log5 = new NetworkLog(5, 5, 5, LocalDateTime.now(), "Interface up", "INFO", "192.168.1.5");
            NetworkLog log6 = new NetworkLog(6, 6, 6, LocalDateTime.now(), "Interface down", "WARN", "192.168.1.6");
            NetworkLog log7 = new NetworkLog(7, 7, 7, LocalDateTime.now(), "Configuration applied", "INFO", "192.168.1.7");
            NetworkLog log8 = new NetworkLog(8, 8, 8, LocalDateTime.now(), "Firewall rule added", "INFO", "192.168.1.8");
            NetworkLog log9 = new NetworkLog(9, 9, 9, LocalDateTime.now(), "DNS server updated", "INFO", "192.168.1.9");
            NetworkLog log10 = new NetworkLog(10, 10, 10, LocalDateTime.now(), "Device error", "ERROR", "192.168.1.10");

            // Saving sample log entries to the database
            repository.saveAll(List.of(log1, log2, log3, log4, log5, log6, log7, log8, log9, log10));
        };
    }
}