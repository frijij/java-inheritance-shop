package org.lessons.java.shop;

/*
Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
codice (numero intero)
nome
marca
prezzo
iva
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    // ATTRIBUTI
private int code;
private String name;
private String brand;
private BigDecimal price;
private BigDecimal vat;


/*
fare in modo che:
il codice prodotto sia accessibile solo in lettura
gli altri attributi siano accessibili sia in lettura che in scrittura
il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato

 */
    // COSTRUTTORI

    public Product(String name, String brand, BigDecimal price, BigDecimal vat) {
        Random random = new Random();
        code= random.nextInt(00000000, 100000000);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }


    // GETTERS AND SETTERS

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }

    // METODI
    public BigDecimal getTotalPrice(){
    BigDecimal vatOnPrice = price.multiply(vat);
    BigDecimal totalPrice= price.add(vatOnPrice);
    return totalPrice.setScale(2, RoundingMode.HALF_EVEN);


}

}
