package com.example.StockManager.estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StockController {


    @Autowired
    StockRepository repository;

    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService){
        this.stockService = stockService;
    }

/*    @GetMapping
    public List<Produto> listaProdutos(){
        return stockService.getProdutos();
    }*/

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

    @GetMapping("/gerenciador/cadastro")
    public String cadastro(Model model) {
        model.addAttribute("produto", new Produto());
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

    @PostMapping("/process")
    public String saveForm(@Valid Produto produto, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem","Preencha todos os campos obrigatórios!");
            return "cadastro";
        }
        repository.save(produto);
        return "index";
    }



}
