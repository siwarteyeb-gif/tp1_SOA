package com.siwar.parfum;

import com.siwar.parfum.entities.Parfum;
import com.siwar.parfum.repositories.ParfumRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class ParfumApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParfumApplication.class, args);
    }

    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }

    @Bean
    CommandLineRunner commandLineRunner(ParfumRepository parfumRepository) {
        return args -> {

            parfumRepository.save(
                    Parfum.builder()
                            .nomParfum("Dior Sauvage")
                            .prixParfum(350.0)
                            .dateCreation(new java.util.Date())
                            .marqueCode("DIO")
                            .build()
            );

        };
    }
}