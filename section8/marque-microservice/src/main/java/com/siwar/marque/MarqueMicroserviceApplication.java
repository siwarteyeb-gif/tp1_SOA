package com.siwar.marque;

import com.siwar.marque.entities.Marque;
import com.siwar.marque.repositories.MarqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MarqueMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarqueMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MarqueRepository marqueRepository) {
        return args -> {

            marqueRepository.save(
                    Marque.builder()
                            .marqueName("Dior")
                            .marqueCode("DIO")
                            .build()
            );

            marqueRepository.save(
                    Marque.builder()
                            .marqueName("Chanel")
                            .marqueCode("CHA")
                            .build()
            );
        };
    }
}