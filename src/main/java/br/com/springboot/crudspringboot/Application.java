package br.com.springboot.crudspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Spring Boot application startar a aplicação, configura tudo e le pra executar.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
    	
        SpringApplication.run(Application.class, args);
    }
}
