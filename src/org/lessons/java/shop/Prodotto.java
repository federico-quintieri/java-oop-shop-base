package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // Attributi classe
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public int iva;

    // Costruttore
    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        // Assegno valore random a codice
        Random rand = new Random();
        this.codice = rand.nextInt(); // Genero numero int random e lo assegno ad attributo codice
        // Passo parametri costruttore ad attributi classe
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Metodi classe
    public void PrezzoBase() {
        System.out.println("Prezzo base: " + prezzo);
    }

    public void PrezzoIva() {
        double prezzoConIva = this.prezzo + (this.prezzo * this.iva / 100);
        System.out.println("Prezzo con iva: " + prezzoConIva);
    }

    public void NomeEsteso() {
        System.out.println("Nome esteso: " + this.codice + "-" + this.nome);
    }

}
