package org.lessons.java.shop;

import java.math.BigDecimal;

/*
Lo shop gestisce diversi tipi di prodotto:
Cuffie, caratterizzate dal colore e se sono wireless o cablate
 */
// estende la superclasse Product
public class Headphones extends Product{
    // ATTRIBUTI
private String color;
private boolean isWireless;

    // COSTRUTTORI
    public Headphones (String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean isWireless){
        super(name, brand, price, vat);
        this.color=color;
        this.isWireless=isWireless;
    }

    //GETTERS AND SETTERS

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    // METODI


    @Override
    public String toString() {
        return "Headphones{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", price=" + getPrice() +
                ", vat=" + getVat() +
                "color='" + color + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
