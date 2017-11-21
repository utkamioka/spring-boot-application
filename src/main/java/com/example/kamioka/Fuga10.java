package com.example.kamioka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Profile("!test")
@Order(10)
@Configuration
public class Fuga10 implements CommandLineRunner {
    @Autowired
    private ApplicationArguments applicationArguments;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------------------------------");
        System.out.println("Fuga10.run()");
        System.out.println("args = " + Arrays.asList(args));
        boolean debug = applicationArguments.containsOption("debug");
        System.out.println("debug = " + debug);
        System.out.println("args = " + applicationArguments.getNonOptionArgs());
        System.out.println("--------------------------------");
    }
}
