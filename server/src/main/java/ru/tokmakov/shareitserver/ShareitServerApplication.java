package ru.tokmakov.shareitserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "ru.tokmakov")
@EnableJpaRepositories(basePackages = "ru.tokmakov.shareitserver")
public class ShareitServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShareitServerApplication.class, args);
    }
}