package com.example.MyBus_backand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MyBusBackandApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBusBackandApplication.class, args);
	}

}
