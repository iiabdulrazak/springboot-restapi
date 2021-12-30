package com.pinocchiovirus.demomicrorestapi.coffee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CoffeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(CoffeeRepository repository){
        return args -> {
                Coffee abdulrazak =  new Coffee(
                        "Abdulrazak A. Osman",
                        LocalDate.of(2021, Month.DECEMBER, 29),
                        "0547079680"
                );

                Coffee abdulrahman = new Coffee(

                            "Abdulrahman A. Osman",
                            LocalDate.of(2021, Month.DECEMBER, 30),
                            "0546995684"
                );

                Coffee abdulwahab = new Coffee(
                            3L,
                            "Abdulwahab A. Osman",
                            LocalDate.of(2021, Month.DECEMBER, 30),
                            "0590599809"
                );
                //saving to the database
            repository.saveAll(
                    List.of(abdulrazak, abdulrahman, abdulwahab)
            );
        };
    }
}
