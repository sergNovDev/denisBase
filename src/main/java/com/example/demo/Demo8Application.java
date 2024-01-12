package com.example.demo;

import com.example.demo.repository.UsersRepository;
import com.example.demo.service.ProcessService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.valves.JDBCAccessLogValve;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Demo8Application {


    public static void main(String[] args) {
        SpringApplication.run(Demo8Application.class, args);

    }

}
