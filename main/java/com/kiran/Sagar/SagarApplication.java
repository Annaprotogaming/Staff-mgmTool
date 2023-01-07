package com.kiran.Sagar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan({"controller","service","dao","entity"})
@EntityScan({"entity"})
public class SagarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagarApplication.class, args);
	}

}
