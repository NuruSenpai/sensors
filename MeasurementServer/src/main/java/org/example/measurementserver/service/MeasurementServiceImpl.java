package org.example.measurementserver.service;

import lombok.RequiredArgsConstructor;
import org.example.measurementserver.repository.MeasurementRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MeasurementServiceImpl {
    private final MeasurementRepository measurementRepository;



}
