package org.example.measurementserver.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;

@Profile("feign")
@FeignClient(name = "MeasurementServer")
public interface SensorFeignClient extends SensorClient {
}
