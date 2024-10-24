package org.example.measurementserver.client;

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
    Boolean existsByName(@PathVariable String name);
}
