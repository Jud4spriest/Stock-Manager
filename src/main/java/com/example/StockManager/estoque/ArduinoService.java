package com.example.StockManager.estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.logging.Level;

@Service
public class ArduinoService {

    private final ArduinoRepository arduinoRepository;

    public static final String ADDRESS = "192.168.0.103";

    @Autowired
    public ArduinoService(ArduinoRepository arduinoRepository) {
        this.arduinoRepository = arduinoRepository;
    }

/*    @Transactional //turns entity into a manage state
    public void updateArduino(int var, long productID) {
        if(!isArduino(ADDRESS)){
            System.out.println("Host inativo!");
            return;
        }
        Arduino arduino = arduinoRepository.findById("STATE_ARDUINO").orElseThrow(() -> new IllegalStateException("Can't Connect"));
        arduino.setValue(var);
        arduino.setProductId(productID);
    }*/

/*    public boolean isArduino(String addr) {

        try {

            if (InetAddress.getByName(addr).isReachable(2000)) {
                String nome = InetAddress.getByName(addr).getHostName();
                System.out.println("Host " + nome + " (" + addr + ") ativo!");
                return true;
            } else {

                return false;
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(ArduinoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArduinoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            return true;
        }
    }*/
}
