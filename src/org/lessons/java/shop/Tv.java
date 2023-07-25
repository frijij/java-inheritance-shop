package org.lessons.java.shop;

/*
Lo shop gestisce diversi tipi di prodotto:
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
 */
// estende la superclasse Product

public class Tv extends Product{

    // ATTRIBUTI
private int dimensions;
private boolean isSmart;

    // COSTRUTTORI


    //GETTERS AND SETTERS

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }


    // METODI


}
