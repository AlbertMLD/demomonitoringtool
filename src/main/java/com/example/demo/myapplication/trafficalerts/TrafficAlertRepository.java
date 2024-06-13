package com.example.demo.myapplication.trafficalerts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing TrafficAlert entities.
 */
public interface TrafficAlertRepository extends JpaRepository<TrafficAlert, Long> {
    // Custom queries can be added here if needed
}