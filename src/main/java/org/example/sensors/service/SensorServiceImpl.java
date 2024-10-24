package org.example.sensors.service;

import lombok.RequiredArgsConstructor;
import org.example.sensors.entity.Sensor;
import org.example.sensors.repository.SensorRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SensorServiceImpl {
    private final SensorRepository sensorRepository;

    public void registerSensor(Sensor sensor) {
        if (sensorRepository.existsByName(sensor.getName())) {
            throw new IllegalArgumentException("Датчик с таким именем уже существует");
        }
        sensorRepository.save(sensor);
    }

    public boolean existsByName(String name) {
        return sensorRepository.existsByName(name);
    }
}
