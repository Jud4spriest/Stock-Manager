package com.example.StockManager.estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {


    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;

    }

    public List<Produto> getProdutos(){
        return produtoRepository.findAll();
        /*return List.of(
                new Produto(
                        "Fone de Ouvido",
                        "Acessorio",
                        100.00,
                        150.00
                )
        );*/
    }


}
