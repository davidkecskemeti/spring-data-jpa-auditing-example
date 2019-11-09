package com.forloop.spring.data.auditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories
public class AuditingExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditingExampleApplication.class, args);
    }

}
