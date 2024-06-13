package com.example.demo.myapplication.networklogs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkLogService {

    private static final Logger logger = LoggerFactory.getLogger(NetworkLogService.class);

    private final NetworkLogRepository networkLogRepository;

    @Autowired
    public NetworkLogService(NetworkLogRepository networkLogRepository) {
        this.networkLogRepository = networkLogRepository;
    }

    /**
     * Retrieves all network logs from the database.
     *
     * @return List of NetworkLog objects representing all logs in the database
     */
    public List<NetworkLog> getAllLogs() {
        logger.info("Fetching all network logs");
        return networkLogRepository.findAll();
    }
}