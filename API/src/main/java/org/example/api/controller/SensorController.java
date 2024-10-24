package org.example.api.controller;

import org.example.api.DTO.SensorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SensorController {
    @PostMapping("/registration")
    ResponseEntity<String> registerSensor(@RequestBody SensorDTO sensorDTO);

    @GetMapping("/name/{name}")
    ResponseEntity<Boolean> existsByName(@PathVariable String name);
}
