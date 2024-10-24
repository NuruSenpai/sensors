package org.example.measurementserver.testSender;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MeasurementRequest {
    private BigDecimal value;
    private boolean raining;
    private Sensor sensor;


    @Data
    @AllArgsConstructor
    public static class Sensor {
        private String name;
    }
}
