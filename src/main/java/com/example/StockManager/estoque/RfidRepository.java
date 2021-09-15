package com.example.StockManager.estoque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RfidRepository extends JpaRepository <CadastroRFID,Long> {

    @Query("SELECT rfid FROM CadastroRFID rfid WHERE rfid.id = ?1")
    CadastroRFID findByProductId(long id);

}
