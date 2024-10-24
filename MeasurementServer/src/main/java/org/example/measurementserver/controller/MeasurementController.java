package org.example.measurementserver.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.measurementserver.DTO.MeasurementDTO;
import org.example.measurementserver.entity.Measurement;
import org.example.measurementserver.mapper.MeasurementMapper;
import org.example.measurementserver.service.MeasurementServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/measurements")
public class MeasurementController {
    private final MeasurementServiceImpl measurementService;

    @PostMapping("/add")
    public ResponseEntity<String> addMeasurement(@Valid @RequestBody MeasurementDTO measurementDTO) {
        String sensorName = measurementDTO.getSensor().getName();
        Measurement measurement = MeasurementMapper.INSTANCE.measurementDTOToMeasurement(measurementDTO);
        measurementService.addMeasurement(measurement, sensorName);
        return ResponseEntity.ok("Measurement added successfully");
    }

    @GetMapping
    public ResponseEntity<List<Measurement>> getAllMeasurements() {
        List<Measurement> measurements = measurementService.getAllMeasurements();
        return ResponseEntity.ok(measurements);
    }

    @GetMapping("/rainyDaysCount")
    public ResponseEntity<Long> countByRainingTrue() {
        long count = measurementService.countByRainingTrue();
        return ResponseEntity.ok(count);
    }
}
