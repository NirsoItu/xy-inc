package com.xyinc.gps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpsApplication.class, args);
	}

}
