package com.example.kamioka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Profile("!test")
@Order(15)
@Component
public class Hoge implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------------------------------");
        System.out.println("Hoge.run()");
        System.out.println("args = " + Arrays.asList(args));
        System.out.println("--------------------------------");
    }
}
