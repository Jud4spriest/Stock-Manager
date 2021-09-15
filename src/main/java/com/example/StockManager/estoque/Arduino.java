package com.example.StockManager.estoque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Arduino {


    @Id
    private String var;

    @Column(columnDefinition = "TINYINT")
    private int value;  //0 - STAND-BY MODE; 1 - RFID MODE; 2 - PLATFORM MODE

    @NotNull
    private long product;


    public long getProduct() {
        return product;
    }

    public void setProduct(long product) {
        this.product = product;
    }

    public String getVar() {
        return var;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
