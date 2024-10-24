package org.example.api.controller;

import org.example.api.DTO.MeasurementDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface MeasurementController {
    @PostMapping("/add")
    ResponseEntity<String> addMeasurement(@RequestBody MeasurementDTO measurementDTO);
}
