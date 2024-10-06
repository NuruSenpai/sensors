package org.example.sensors.repository;

import org.example.sensors.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
    boolean existsByName(String name);
}
