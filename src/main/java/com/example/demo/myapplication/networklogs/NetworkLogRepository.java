package com.example.demo.myapplication.networklogs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkLogRepository extends JpaRepository<NetworkLog, Long> {
    // Additional query methods can be added here
}