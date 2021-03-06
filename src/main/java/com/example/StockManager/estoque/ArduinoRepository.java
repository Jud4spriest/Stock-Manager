package com.example.StockManager.estoque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArduinoRepository
        extends JpaRepository<Arduino,String> {

    @Query("SELECT arduino FROM Arduino arduino WHERE arduino.var = 'STATE_ARDUINO'")
    Arduino selectMode();

    @Query("SELECT arduino.product FROM Arduino arduino WHERE arduino.var = 'STATE_ARDUINO'")
    Long findProductId();

    @Query("SELECT arduino.value FROM Arduino arduino WHERE arduino.var = 'STATE_ARDUINO'")
    Integer findMode();

}
