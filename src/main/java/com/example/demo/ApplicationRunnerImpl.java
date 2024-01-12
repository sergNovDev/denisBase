package com.example.demo;

import com.example.demo.service.ProcessService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicationRunnerImpl implements ApplicationRunner {

    private final ProcessService processService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        processService.start();
    }
}