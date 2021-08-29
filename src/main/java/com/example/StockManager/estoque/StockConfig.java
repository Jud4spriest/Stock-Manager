

package com.example.StockManager.estoque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StockConfig {

    @Bean
    CommandLineRunner commandLineRunner(StockRepository repository) {
        return args -> {
/*            Produto x = new Produto(
                    "Fone de Ouvido",
                    "Acessorio",
                    100.00,
                    "150.00"
            );

            Produto y = new Produto(
                    "Coca",
                    "Bebida",
                    2.00,
                    "5.00"
            );*/

/*            repository.saveAll(List.of(x,y));*/

        };
    }
}

