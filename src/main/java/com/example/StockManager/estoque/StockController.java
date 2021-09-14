package com.example.StockManager.estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class StockController {


    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    ArduinoRepository arduinoRepository;

    private final ProdutoService produtoService;
    private final ArduinoService arduinoService;

    @Autowired
    public StockController(ProdutoService produtoService, ArduinoService arduinoService){
        this.produtoService = produtoService;
        this.arduinoService = arduinoService;
    }

/*    @GetMapping
    public List<Produto> listaProdutos(){
        return produtoService.getProdutos();
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
    public String entrada(Model model){
        Arduino arduino = arduinoRepository.findByProductId("STATE_ARDUINO");
        model.addAttribute("arduino", arduino);
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
        produtoRepository.save(produto);
        return "index";
    }

    @PostMapping("/connectrfid")
    public String atualizaArduino(@RequestParam int product){
        Arduino arduino = arduinoRepository.findByProductId("STATE_ARDUINO");
        int operacao = 1;
        arduino.setValue(operacao);
        arduino.setProduct(product);
        final Arduino updatedEmployee = arduinoRepository.save(arduino);
        return "index";
    }


}

