package org.example.measurementserver.testSender;

import lombok.AllArgsConstructor;
import org.example.api.DTO.SensorDTO;
import org.example.measurementserver.DTO.MeasurementDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Random;
@AllArgsConstructor
@Component
public class MeasurementSender {
    private final RestTemplate restTemplate;
    private final String url = "http://localhost:8081/measurements/add";

    public void sendMeasurements(int numberOfRequests) {
        Random random = new Random();

        for (int i = 0; i < numberOfRequests; i++) {
            BigDecimal temperature = BigDecimal.valueOf(random.nextDouble() * 100);
            Boolean raining = random.nextBoolean();
            SensorDTO sensorDTO = new SensorDTO("sensor1");
            MeasurementDTO request = new MeasurementDTO(temperature, raining, sensorDTO);

            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
            System.out.println("Ответ на запрос " + (i + 1) + ": " + response.getBody());
        }
    }
}
