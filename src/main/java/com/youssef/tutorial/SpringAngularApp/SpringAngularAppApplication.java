package com.youssef.tutorial.SpringAngularApp;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.youssef.tutorial.SpringAngularApp.model.User;
import com.youssef.tutorial.SpringAngularApp.model.UserRepository;

@SpringBootApplication
public class SpringAngularAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularAppApplication.class, args);
	}

	@Bean
	CommandLineRunner init (UserRepository userRepository) {
		return args -> {
			Stream.of("Jhon","Julie","Jennifer","Helen","Rachel").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@domain.com");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}
}
