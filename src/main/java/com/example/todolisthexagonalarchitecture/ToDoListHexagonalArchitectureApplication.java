package com.example.todolisthexagonalarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.todolisthexagonalarchitecture.adapter.out.persistence"})
@EntityScan("com.example.todolisthexagonalarchitecture.adapter.out.persistence")
public class ToDoListHexagonalArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListHexagonalArchitectureApplication.class, args);
    }

}
