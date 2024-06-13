package com.example.demo.myapplication.networkinterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing NetworkInterface entities.
 * Extends JpaRepository which provides the implementation of basic CRUD operations.
 */
@Repository
public interface NetworkInterfaceRepository extends JpaRepository<NetworkInterface, Long> {
}
