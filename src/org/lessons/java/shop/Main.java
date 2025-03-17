package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto merendine = new Prodotto("Kinder Paradiso", "Merendine belle e buone", 2.51, 20);

        merendine.NomeEsteso();
        System.out.println(merendine.descrizione);
        merendine.PrezzoBase();
        merendine.PrezzoIva();
    }
}
