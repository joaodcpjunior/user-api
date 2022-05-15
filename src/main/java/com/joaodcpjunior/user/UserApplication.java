package com.joaodcpjunior.user;

import com.joaodcpjunior.user.enumeration.Status;
import com.joaodcpjunior.user.model.User;
import com.joaodcpjunior.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.joaodcpjunior.user.enumeration.Status.USER_ADMIN;
import static com.joaodcpjunior.user.enumeration.Status.USER_NORMAL;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User(null, "João", "joao@email.com", USER_ADMIN));
            userRepository.save(new User(null, "Ana", "ana@email.com", USER_NORMAL));
            userRepository.save(new User(null, "Maria", "maria@email.com", USER_ADMIN));
            userRepository.save(new User(null, "Matheus", "matheus@email.com", USER_NORMAL));
            userRepository.save(new User(null, "Jose", "jose@email.com", USER_ADMIN));
        };
    }
}
