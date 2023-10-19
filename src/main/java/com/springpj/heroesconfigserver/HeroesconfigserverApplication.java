package com.springpj.heroesconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HeroesconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesconfigserverApplication.class, args);
	}

}
