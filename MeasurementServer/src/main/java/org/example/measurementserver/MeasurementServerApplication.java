package org.example.measurementserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class MeasurementServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeasurementServerApplication.class, args);
	}


}
