package com.Spring_Boot.Spring.Boot.Learning.Project;

import ch.qos.logback.core.joran.util.StringToObjectConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.PublicKey;

@SpringBootApplication
public class SpringBootLearningProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearningProjectApplication.class, args);
    }
}
