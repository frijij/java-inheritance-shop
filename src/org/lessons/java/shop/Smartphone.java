package org.lessons.java.shop;


import java.math.BigDecimal;
import java.util.Random;

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
public Smartphone (String name, String brand, BigDecimal price, BigDecimal vat, int memory){
    super(name, brand, price, vat);
    Random random = new Random();
imeiCode= random.nextInt(10000000, 100000000);
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


    @Override
    public String toString() {
        return "Smartphone{" +
                "code=" + getCode() +
                ", name='" + getName()+ '\'' +
                ", brand='" + getBrand() + '\'' +
                ", price=" + getPrice() +
                ", vat=" + getVat() +
                ", imeiCode=" + imeiCode +
                ", memory=" + memory +
                '}';
    }
}
