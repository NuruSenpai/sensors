package org.example.measurementserver.service;

import lombok.RequiredArgsConstructor;
import org.example.measurementserver.client.SensorClient;
import org.example.measurementserver.entity.Measurement;
import org.example.measurementserver.repository.MeasurementRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MeasurementServiceImpl {
    private final MeasurementRepository measurementRepository;
    private final SensorClient sensorClient;

    public void addMeasurement(Measurement measurement, String sensorName) {
        if (!sensorClient.existsByName(sensorName)) {
            throw new IllegalArgumentException("Сенсор с именем " + sensorName + " не существует");
        }

        measurement.setSensorName(sensorName);
        measurement.setTime(LocalDateTime.now());
        measurementRepository.save(measurement);
    }

    public List<Measurement> getAllMeasurements() {
        return measurementRepository.findAll();
    }

    public long countByRainingTrue() {
        return measurementRepository.countByRainingTrue();
    }
}
