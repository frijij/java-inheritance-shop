package org.lessons.java.shop;


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
