package org.example.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class MeasurementDTO {

    private BigDecimal value;

    private Boolean raining;

    private String sensorName;

    private LocalDateTime time;
}
