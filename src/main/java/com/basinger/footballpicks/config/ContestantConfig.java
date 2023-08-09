package com.basinger.footballpicks.config;

import com.basinger.footballpicks.model.Contestant;
import com.basinger.footballpicks.repository.ContestantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ContestantConfig {
    @Bean
    CommandLineRunner commandLineRunner(ContestantRepository contestantRepository) {
        return args -> {
            Contestant one = new Contestant(
                    "Brennan",
                    "brennan@example.com"
            );

            Contestant two = new Contestant(
                    "David",
                    "david@example.com"
            );

            Contestant three = new Contestant(
                    "Jessi",
                    "jessi@example.com"
            );

            contestantRepository.saveAll(
                    List.of(one,two,three)
            );


        };
    }

}
