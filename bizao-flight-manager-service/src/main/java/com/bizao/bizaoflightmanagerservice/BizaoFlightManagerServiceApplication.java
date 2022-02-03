package com.bizao.bizaoflightmanagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bizao"})
public class BizaoFlightManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizaoFlightManagerServiceApplication.class, args);
	}

}
