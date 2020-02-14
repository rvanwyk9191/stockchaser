package com.reinhardt.stockchaser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.reinhardt.stockchaser.controller"})
public class StockchaserApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockchaserApplication.class, args);
	}

}
