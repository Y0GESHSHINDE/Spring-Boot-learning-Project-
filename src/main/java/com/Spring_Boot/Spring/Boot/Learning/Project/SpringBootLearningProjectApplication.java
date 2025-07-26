package com.Spring_Boot.Spring.Boot.Learning.Project;

import ch.qos.logback.core.joran.util.StringToObjectConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.PublicKey;

@SpringBootApplication
public class SpringBootLearningProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningProjectApplication.class, args);}

	private  final PaymentService obj;

	public SpringBootLearningProjectApplication(PaymentService obj) {
		this.obj = obj;
	}

	@Override
	public void run(String... args) throws Exception {
		obj.pay();
	}
}
