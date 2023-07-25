package org.lessons.java.shop;

/*
Lo shop gestisce diversi tipi di prodotto:
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
 */
// estende la superclasse Product

import java.math.BigDecimal;

public class Tv extends Product{

    // ATTRIBUTI
private String dimensions;
private boolean isSmart;

    // COSTRUTTORI
    public Tv (String name, String brand, BigDecimal price, BigDecimal vat, String dimensions, boolean isSmart){
        super(name, brand, price, vat);
        this.dimensions=dimensions;
        this.isSmart=isSmart;
    }

    //GETTERS AND SETTERS

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }


    // METODI


    @Override
    public String toString() {
        return "Tv{" +
                "code=" + getCode() +
                ", name='" + getName()+ '\'' +
                ", brand='" + getBrand()+ '\'' +
                ", price=" + getPrice() +
                ", vat=" + getVat() +
                "dimensions='" + dimensions + '\'' +
                ", isSmart=" + isSmart +
                '}';
    }
}
