package com.example.StockManager.estoque;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
@RequestMapping("/database")
public class ApiController {

    @Autowired
    ArduinoRepository arduinoRepository;
    @Autowired
    RfidRepository rfidRepository;

    @GetMapping("/mode")
    public Integer modoArduino(){
        return arduinoRepository.findMode();
    }

    @GetMapping("/produto")
    public Long produtoArduino(){
        return arduinoRepository.findProductId();
    }

    @GetMapping("/x/{product}")
    public Integer getPositionX(@PathVariable("product") long product){
        return rfidRepository.findByProductId(product).getPosX();
    }
    @GetMapping("/y/{product}")
    public Integer getPositionY(@PathVariable("product") long product){
        return rfidRepository.findByProductId(product).getPosY();
    }
    @PostMapping(path = "/cadastrorfid", consumes = "application/json")
    public CadastroRFID cadastroRfid(@RequestBody @Valid CadastroRFID cadastro){
        cadastro.setDataEntrada(LocalDate.now());
        return rfidRepository.save(cadastro);
    }
    @PostMapping(path = "/mode0", consumes = "application/x-www-form-urlencoded")
    public Arduino mode0Arduino(@RequestBody @RequestParam Integer mode0){
        if (mode0 != 0) {
            throw new IllegalStateException("Já possui um livro com este código cadastrado!");
        } else {
            Arduino arduino = arduinoRepository.selectMode();
            arduino.setValue(mode0);
            arduino.setProduct(mode0);
            return arduinoRepository.save(arduino);
        }
    }
}
