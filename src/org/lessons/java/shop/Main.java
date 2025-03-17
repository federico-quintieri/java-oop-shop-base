package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto merendine = new Prodotto("Kinder Paradiso", "Kinder", BigDecimal.valueOf(2.32),
                BigDecimal.valueOf(0.2));

        System.out.println(merendine.getCodice());
        merendine.NomeEsteso();
        System.out.println(merendine.getIva());
        merendine.setIva(BigDecimal.valueOf(0.40));
        System.out.println(merendine.getIva());

    }
}
