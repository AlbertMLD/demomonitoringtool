package com.example.demo.myapplication.networklogs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NetworkLogService {

    private static final Logger logger = LoggerFactory.getLogger(NetworkLogService.class);

    private final NetworkLogRepository networkLogRepository;

    @Autowired
    public NetworkLogService(NetworkLogRepository networkLogRepository) {
        this.networkLogRepository = networkLogRepository;
    }

    public List<NetworkLog> getAllLogs() {
        logger.info("Fetching all network logs");
        return networkLogRepository.findAll();
    }

    public Optional<NetworkLog> getLogById(Long logId) {
        logger.info("Fetching network log with ID {}", logId);
        return networkLogRepository.findById(logId);
    }

    public void addNewLog(NetworkLog networkLog) {
        logger.info("Adding new network log: {}", networkLog);
        networkLogRepository.save(networkLog);
    }

    public void deleteLog(Long logId) {
        boolean exists = networkLogRepository.existsById(logId);
        if (!exists) {
            logger.error("Network log with ID {} does not exist", logId);
            throw new NetworkLogNotFoundException(logId, "/api/v1/network-logs/" + logId);
        }
        logger.info("Deleting network log with ID {}", logId);
        networkLogRepository.deleteById(logId);
    }
}