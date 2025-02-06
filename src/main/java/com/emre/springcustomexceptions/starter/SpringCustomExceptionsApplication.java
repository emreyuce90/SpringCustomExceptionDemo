package com.emre.springcustomexceptions.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories({"com.emre.springcustomexceptions"})
@EntityScan({"com.emre.springcustomexceptions"})
@ComponentScan({"com.emre.springcustomexceptions"})
@SpringBootApplication
public class SpringCustomExceptionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomExceptionsApplication.class, args);
    }

}
