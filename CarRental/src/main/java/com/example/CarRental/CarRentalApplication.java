package com.example.CarRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import com.example.CarRental.entity.User;
import com.example.CarRental.repository.UserRepository;

@SpringBootApplication
public class CarRentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarRentalApplication.class, args);
    }

    @Bean
    CommandLineRunner initDefaultUser(UserRepository userRepository) {
        return args -> {
            String defaultUsername = "venkateshmannam2005@gmail.com";
            User existing = userRepository.findByUsername(defaultUsername);
            if (existing == null) {
                User user = new User();
                user.setUsername(defaultUsername);
                user.setPassword("test123");
                user.setRole("USER");
                userRepository.save(user);
                System.out.println("Created default user: " + defaultUsername);
            }
        };
    }

}
