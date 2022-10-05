package com.Wouldu.wouldu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WoulduApplication {

	public static void main(String[] args) {
		SpringApplication.run(WoulduApplication.class, args);
	}

}
