package com.example.StockManager.estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StockController {

    @Autowired
    ProdutoRepository produtoRepository;
    @Autowired
    ArduinoRepository arduinoRepository;
    @Autowired
    RfidRepository rfidRepository;

    private final ProdutoService produtoService;
    private final ArduinoService arduinoService;

    @Autowired
    public StockController(ProdutoService produtoService, ArduinoService arduinoService){
        this.produtoService = produtoService;
        this.arduinoService = arduinoService;
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

    @GetMapping("/gerenciador/cadastro")
    public String cadastro(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastro";
    }

    @RequestMapping("/gerenciador/entrada")
    public String entrada(Model model){
        Arduino arduino = arduinoRepository.selectMode();
        model.addAttribute("arduino", arduino);
        return "entrada";
    }

    @RequestMapping("/gerenciador/consulta")
    public String consulta(Model model){
        model.addAttribute("produtos",produtoService.getProdutos());
        return "consulta";
    }

/*    @GetMapping("/gerenciador/consulta")
    public ModelAndView listar() {
        List<Produto> lista = produtoRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("consulta");
        modelAndView.addObject("consulta", lista);
        return modelAndView;
    }*/

    @RequestMapping("/gerenciador/despacho")
    public String despacho(Model model){
        Arduino arduino = arduinoRepository.selectMode();
        model.addAttribute("arduino", arduino);
        return "saida";
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
    public String atualizaArduino(@RequestParam long product){
        Arduino arduino = arduinoRepository.selectMode();
        Produto produto = produtoRepository.findByProductId(product);
        produto.setQtd(produto.getQtd()+1);
        int operacao = 1;
        arduino.setValue(operacao);
        arduino.setProduct(product);
        final Produto updatedProduto = produtoRepository.save(produto);
        final Arduino updatedArduino = arduinoRepository.save(arduino);
        return "index";
    }

    @PostMapping("/connectplatform")
    public String atualizaArduino2(@RequestParam int product){
        Arduino arduino = arduinoRepository.selectMode();
        Produto produto = produtoRepository.findByProductId(product);
        produto.setQtd(produto.getQtd()-1);
        int operacao = 2;
        arduino.setValue(operacao);
        arduino.setProduct(product);
        final Produto updatedProduto = produtoRepository.save(produto);
        final Arduino updatedArduino = arduinoRepository.save(arduino);
        return "index";
    }


}

