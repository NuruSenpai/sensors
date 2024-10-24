package org.example.measurementserver.client;

import lombok.RequiredArgsConstructor;
import org.example.api.DTO.SensorDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Profile("rest")
@RequiredArgsConstructor
@Component
public class SensorRestClient implements SensorClient {
    private final RestTemplate restTemplate;

    @Override
    public ResponseEntity<String> registerSensor(SensorDTO sensorDTO) {
        return null;
    }

    @Override
    public Boolean existsByName(String name) {
        String url = "http://sensors/sensor/name/" + name;
        return restTemplate.getForObject(url, Boolean.class);
    }
}
