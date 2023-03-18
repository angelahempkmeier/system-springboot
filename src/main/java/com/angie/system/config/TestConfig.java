package com.angie.system.config;

import com.angie.system.entities.User;
import com.angie.system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "999999988", "123");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}