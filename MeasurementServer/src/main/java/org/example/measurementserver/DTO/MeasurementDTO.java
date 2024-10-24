package org.example.measurementserver.DTO;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class MeasurementDTO {

    @NotNull(message = "измеренение не должно быть пустым")
    @DecimalMin(value = "-100", message = "значение должно быть не меньше -100")
    @DecimalMax(value = "100", message = "значение должно быть не больше 100")
    private BigDecimal value;

    @NotNull(message = "статус погоды не должно быть пустым")
    private Boolean raining;

    @NotNull(message = "Не указан Id сенсора")
    private SensorDTO sensor;


}
