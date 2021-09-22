package com.example.StockManager.estoque;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;

@RestController
@RequestMapping("/database")
public class ApiController {

    @Autowired
    ArduinoRepository arduinoRepository;

    @GetMapping(path = "/mode")
    public Integer modoArduino(){
        return arduinoRepository.findMode();
    }


}
