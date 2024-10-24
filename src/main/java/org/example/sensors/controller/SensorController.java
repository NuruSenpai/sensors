package org.example.sensors.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.sensors.DTO.SensorDTO;
import org.example.sensors.entity.Sensor;
import org.example.sensors.mapper.SensorMapper;
import org.example.sensors.service.SensorServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensor")
@RequiredArgsConstructor
public class SensorController {
    private final SensorServiceImpl sensorService;

    @PostMapping("/registration")
    public ResponseEntity<String> registerSensor(@Valid @RequestBody SensorDTO sensorDTO) {
        Sensor sensor = SensorMapper.INSTANCE.sensorDTOToSensor(sensorDTO);
        sensorService.registerSensor(sensor);
        return ResponseEntity.ok("Сенсор зарегистрирован ");
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Boolean> existsByName(@PathVariable String name) {
        return ResponseEntity.ok(sensorService.existsByName(name));
    }
}
