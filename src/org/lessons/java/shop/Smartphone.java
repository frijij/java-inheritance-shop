package org.lessons.java.shop;


import java.math.BigDecimal;

/*
   Lo shop gestisce diversi tipi di prodotto:
Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
    */
// estende la superclasse Product
public class Smartphone extends Product {

    // ATTRIBUTI
private int imeiCode;
private int memory;

    // COSTRUTTORI
public Smartphone (int code, String name, String brand, BigDecimal price, BigDecimal vat, int imeiCode, int memory){
    super(code, name, brand, price, vat);
this.imeiCode=imeiCode;
this.memory=memory;
}
    //GETTERS AND SETTERS

    public int getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(int imeiCode) {
        this.imeiCode = imeiCode;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

// METODI



}
