package com.example.StockManager.estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

/*    private final StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }*/

    public List<Produto> getProdutos() {
        return List.of(
                new Produto(
                    "Fone de Ouvido",
                    "Acessorio",
                    100.00,
                    150.00
            )
        );

//        return stockRepository.findAll();
    }

}
