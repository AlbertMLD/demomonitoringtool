package com.example.demo.myapplication.networklogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/network-logs")
@Validated
public class NetworkLogController {

    private final NetworkLogService networkLogService;

    @Autowired
    public NetworkLogController(NetworkLogService networkLogService) {
        this.networkLogService = networkLogService;
    }

    @GetMapping
    public ResponseEntity<List<NetworkLog>> getAllLogs() {
        return ResponseEntity.ok(networkLogService.getAllLogs());
    }

    @GetMapping("/{logId}")
    public ResponseEntity<NetworkLog> getLogById(@PathVariable Long logId) {
        return networkLogService.getLogById(logId)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new NetworkLogNotFoundException(logId, "/api/v1/network-logs/" + logId));
    }

    @PostMapping
    public ResponseEntity<String> addNewLog(@Valid @RequestBody NetworkLog networkLog) {
        networkLogService.addNewLog(networkLog);
        return ResponseEntity.status(HttpStatus.CREATED).body("Log created successfully");
    }

    @DeleteMapping("/{logId}")
    public ResponseEntity<String> deleteLog(@PathVariable Long logId) {
        networkLogService.deleteLog(logId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Log deleted successfully");
    }
}