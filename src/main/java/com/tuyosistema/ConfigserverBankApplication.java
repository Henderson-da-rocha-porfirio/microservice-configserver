package com.tuyosistema;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.config.server.*;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverBankApplication.class, args);
	}

}




