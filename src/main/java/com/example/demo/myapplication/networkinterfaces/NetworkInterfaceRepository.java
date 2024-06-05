package com.example.demo.myapplication.networkinterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkInterfaceRepository extends JpaRepository<NetworkInterface, Long> {
}
