package com.eqr.course.config;

import com.eqr.course.entities.User;
import com.eqr.course.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "1234567", "012345");
        User u2 = new User(null, "Alex Brown", "alex@gmail.com", "2345678", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
