package com.tozhang;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
@EnableJpaAuditing
public class SpringTrainingApplication {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
			SpringApplication.run(SpringTrainingApplication.class, args);
			BasicConfigurator.configure();
	}
}

//@SpringBootApplication
//public class SpringTrainingApplication extends SpringBootServletInitializer {
//
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Application.class);
//	}
//
//	public static void main(String[] args) throws Exception {
//		SpringApplication.run(Application.class, args);
//	}
//
//}

