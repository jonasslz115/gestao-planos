package io.teste.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EntityScan("io.teste")
@ComponentScan("io.teste")
@EnableJpaRepositories("io.teste")
public class GestaoPlanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoPlanosApplication.class, args);
	}

}
