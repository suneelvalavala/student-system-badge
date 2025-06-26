package com.telusuko.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.telusuko.entities.Users;
import com.telusuko.repository.UserDetailsRepository;



@Component
public class AdminUserInitializer {

    @Bean
    public CommandLineRunner createAdminUser(UserDetailsRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.findByUsername("suneel").isEmpty()) {
                Users admin = new Users();
                admin.setUsername("suneel");
                admin.setPassword(passwordEncoder.encode("suneel1234")); // Securely store password
                admin.setRole("ROLE_ADMIN");

                userRepository.save(admin);
                System.out.println("Default admin user created!");
            }
            
        };
    }
}