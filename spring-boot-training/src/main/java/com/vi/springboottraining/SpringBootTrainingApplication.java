package com.vi.springboottraining;

import com.vi.springboottraining.model.Hero;
import com.vi.springboottraining.repository.HeroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class SpringBootTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTrainingApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(HeroRepository heroRepository) {
        return args -> {
            if (heroRepository.count() == 0) {
                heroRepository.save(new Hero("Batman"));
                heroRepository.save(new Hero("Superman"));
                heroRepository.save(new Hero("Thor"));
                heroRepository.save(new Hero("Ironman"));
                heroRepository.save(new Hero("Narco"));
                heroRepository.save(new Hero("Celeritas"));
                heroRepository.save(new Hero("Ironman"));
                heroRepository.save(new Hero("Nguyễn Văn Vĩ"));
            }
        };
    }
}
