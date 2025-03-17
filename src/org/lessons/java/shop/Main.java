package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto merendine = new Prodotto("Kinder Paradiso", "Kinder", BigDecimal.valueOf(2.32),
                BigDecimal.valueOf(0.2));

        // Main esercizio
        // System.out.println(merendine.getCodice());
        // merendine.NomeEsteso();
        // System.out.println(merendine.getIva());
        // merendine.setIva(BigDecimal.valueOf(0.40));
        // System.out.println(merendine.getIva());

        // Snack 1
        // Studente me = new Studente("Federico", "Cognome", 26);
        // System.out.println(me.InfoStudente());

        // Snack 2
        // ContoBancario mioConto = new ContoBancario(31234);
        // System.out.println(mioConto.getSaldo());
        // mioConto.Deposita(BigDecimal.valueOf(40));
        // System.out.println(mioConto.getSaldo());
        // mioConto.Preleva(BigDecimal.valueOf(10));
        // System.out.println(mioConto.getSaldo());
    }
}
