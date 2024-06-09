package com.example.demo.myapplication.trafficalerts;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TrafficAlertService {

    private final TrafficAlertRepository trafficAlertRepository;

    @Autowired
    public TrafficAlertService(TrafficAlertRepository trafficAlertRepository) {
        this.trafficAlertRepository = trafficAlertRepository;
    }

    public List<TrafficAlert> getAllTrafficAlerts() {
        return trafficAlertRepository.findAll();
    }

    // Method to initialize sample data
    @PostConstruct
    public void initSampleData() {
        if (trafficAlertRepository.count() == 0) {
            trafficAlertRepository.saveAll(List.of(
                    new TrafficAlert(1, 101, "Interface A", "High Traffic", LocalDateTime.now()),
                    new TrafficAlert(2, 102, "Interface B", "Device Down", LocalDateTime.now().minusMinutes(5)),
                    new TrafficAlert(3, 103, "Interface C", "Network Congestion", LocalDateTime.now().minusMinutes(10)),
                    new TrafficAlert(1, 104, "Interface D", "Low Bandwidth", LocalDateTime.now().minusMinutes(15)),
                    new TrafficAlert(2, 105, "Interface E", "High Latency", LocalDateTime.now().minusMinutes(20)),
                    new TrafficAlert(3, 106, "Interface F", "Packet Loss", LocalDateTime.now().minusMinutes(25)),
                    new TrafficAlert(1, 107, "Interface G", "Jitter", LocalDateTime.now().minusMinutes(30)),
                    new TrafficAlert(2, 108, "Interface H", "Link Down", LocalDateTime.now().minusMinutes(35)),
                    new TrafficAlert(3, 109, "Interface I", "Interface Error", LocalDateTime.now().minusMinutes(40)),
                    new TrafficAlert(1, 110, "Interface J", "Unauthorized Access", LocalDateTime.now().minusMinutes(45))
            ));
        }
    }
}