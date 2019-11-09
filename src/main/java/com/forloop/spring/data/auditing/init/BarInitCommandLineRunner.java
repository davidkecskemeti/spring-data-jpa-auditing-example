package com.forloop.spring.data.auditing.init;

import com.forloop.spring.data.auditing.entity.Bar;
import com.forloop.spring.data.auditing.service.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BarInitCommandLineRunner implements CommandLineRunner {

    @Autowired
    private BarService barService;

    @Override
    public void run(String... args) throws Exception {
        Bar bar = new Bar();
        barService.save(bar);
    }
}
