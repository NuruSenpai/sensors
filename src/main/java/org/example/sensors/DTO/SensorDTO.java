package org.example.sensors.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SensorDTO {

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 3, max = 30, message = "Имя должно быть не меньше 3 и не больше 30")
    private String name;
}
