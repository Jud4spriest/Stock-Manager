package com.example.StockManager.estoque;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class StockController {

    @GetMapping
    public List<Produto> listaProdutos(){
        return List.of(
                new Produto(
                        "Fone de Ouvido",
                        "Acessorio",
                        100.00,
                        150.00
                )
        );
    }

    @RequestMapping("/home")
    public String index(){
        return "index";
    }

    @RequestMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @RequestMapping("/gerenciador")
    public String gerenciador(){
        return "gerenciador";
    }

    @RequestMapping("/gerenciador/cadastro")
    public String cadastro(){
        return "cadastro";
    }

    @RequestMapping("/gerenciador/entrada")
    public String entrada(){
        return "entrada";
    }

    @RequestMapping("/gerenciador/consulta")
    public String consulta(){
        return "consulta";
    }

    @RequestMapping("/gerenciador/despacho")
    public String despacho(){
        return "despacho";
    }




}
