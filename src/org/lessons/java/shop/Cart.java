package org.lessons.java.shop;


import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

/*
Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente
richiamate il costruttore opportuno.
Al termine dell’inserimento stampate gli elementi del carrello (fate l’override del metodo toString nelle varie classi per restituire le informazioni
da stampare)
 */
public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // definisco variabile vat
        BigDecimal vatInput= new BigDecimal("0.2");

        System.out.println("WELCOME TO OUR SHOP! START YOUR SHOPPING HERE!");
        boolean exit = false;
        while (!exit) {
            System.out.println("Select a category: 1 = smartphones; 2 = televisions; 3 = headphones.");
            String categoryChoice = scan.nextLine();
            switch (categoryChoice) {
                // se sceglie 1 vuole acquistare smartphone
                case "1":
                    System.out.println("You choosed smartphones.");
                    System.out.println("Enter a brand: ");
                    String brandInput = scan.nextLine();
                    System.out.print("Enter a model: ");
                    String nameInput = scan.nextLine();
                    Smartphone smartphone = new Smartphone(nameInput, brandInput, new BigDecimal("600"), vatInput, 0);
                    System.out.println("Select memory dimension: 1 = 16GB; 2 = 32GB; 3 = 64GB.");
                    String memoryChoice = scan.nextLine();

                    switch (memoryChoice) {
                        case "1":
                            smartphone.setMemory(16);
                            break;
                        case "2":
                            smartphone.setMemory(32);
                            smartphone.setPrice(new BigDecimal("720"));
                            break;
                        case "3":
                            smartphone.setMemory(64);
                            smartphone.setPrice(new BigDecimal("785"));
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    System.out.println(smartphone.toString() + " added to your cart.");
                    System.out.println("TOTAL PRICE: " + smartphone.getTotalPrice() + "€.");
                    break;
                // se sceglie 2 vuole acquistare tv
                case "2":
                    System.out.println("You choosed televisions.");
                    System.out.println("Enter a brand: ");
                    brandInput = scan.nextLine();
                    System.out.print("Enter a model: ");
                    nameInput = scan.nextLine();
                    Tv tv = new Tv(nameInput, brandInput, new BigDecimal("876"), vatInput, "46''", false);
                    System.out.println("Do you want a smart tv? Y/N");
                    String tvChoice = scan.nextLine();
                    switch (tvChoice.toUpperCase()){
                        case "N":
                            tv.setSmart(false);
                            System.out.println("You choosed a normal tv.");
                            break;
                        case "Y":
                            tv.setSmart(true);
                            tv.setPrice(new BigDecimal("999"));
                            System.out.println("You choosed a Smart TV.");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    System.out.println(tv.toString() + " added to your cart.");
                    System.out.println("TOTAL PRICE: " + tv.getTotalPrice() + "€.");
                    break;
                // se sceglie 3 vuole acquistare cuffie
                case "3":
                    System.out.println("You choosed headphones.");
                    System.out.println("Enter a brand: ");
                    brandInput = scan.nextLine();
                    System.out.print("Enter a model: ");
                    nameInput = scan.nextLine();
                    System.out.print("Choose a color: ");
                    String colorInput = scan.nextLine();
                    Headphones headphones = new Headphones(nameInput, brandInput, new BigDecimal("14.99"), vatInput, colorInput, false);
                    System.out.print("Choose an option: 1 = wired; 2 = wireless");
                    String typeChoice = scan.nextLine();
                    switch (typeChoice){
                        case "1":
                            headphones.setWireless(false);
                            break;
                        case "2":
                            headphones.setWireless(true);
                            headphones.setPrice(new BigDecimal("25.99"));
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    System.out.println(headphones.toString() + " added to your cart.");
                    System.out.println("TOTAL PRICE: " + headphones.getTotalPrice() + "€.");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue shopping? Y/N");
            String keepShop = scan.nextLine().toUpperCase();
            switch (keepShop){
                case "Y":
                    exit = false;
                    break;
                case "N":
                    exit=true;
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
