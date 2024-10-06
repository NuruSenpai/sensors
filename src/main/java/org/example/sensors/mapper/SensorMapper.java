package org.example.sensors.mapper;

import org.example.sensors.DTO.SensorDTO;
import org.example.sensors.entity.Sensor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SensorMapper {

    SensorMapper INSTANCE = Mappers.getMapper(SensorMapper.class);

    SensorDTO sensorToSensorDTO(Sensor sensor);

    Sensor sensorDTOToSensor(SensorDTO sensorDTO);


}
