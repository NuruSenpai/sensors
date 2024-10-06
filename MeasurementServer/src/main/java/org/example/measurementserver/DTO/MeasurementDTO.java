package org.example.measurementserver.DTO;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class MeasurementDTO {
    private Long id;

    @NotNull
    @DecimalMin(value = "-100")
    @DecimalMax(value = "100")
    private BigDecimal value;

    @NotNull
    private Boolean raining;

    @NotNull
    private Long sensorId;


    private LocalDateTime time;
}
