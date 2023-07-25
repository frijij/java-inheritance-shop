package org.lessons.java.shop;

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

}
