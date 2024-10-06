package org.example.measurementserver.mapper;

import org.example.measurementserver.DTO.MeasurementDTO;
import org.example.measurementserver.entity.Measurement;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MeasurementMapper {

    MeasurementMapper INSTANCE = Mappers.getMapper(MeasurementMapper.class);

    MeasurementDTO measurementToMeasurementDTO(Measurement measurement);

    Measurement measurementDTOToMeasurement(MeasurementDTO measurementDTO);

}
