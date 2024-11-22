package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libro> libridisponibili = new ArrayList<Libro>();
    ArrayList<Libro> librinoleggiati = new ArrayList<Libro>();

    // aggiungi ibro
    public void aggiungiLibro(Libro libro) {

    }

    // rimuovi libro
    public void rimuoviLibro(Libro libro) {
        if (libridisponibili.isEmpty()) {
            System.out.println("Nessun libro è presente nella biblioteca!");
        } else {
            if (libridisponibili.contains(libro)) {
                libridisponibili.remove(libridisponibili.indexOf(libro));
                System.out.println("Hai rimosso il libro " + libro.toString() + " dalla biblioteca!");
            }
        }

    }

    // presta libro
    public void prestaLibro(Libro libro, Utente utente) {

    }

    // restituisci libro
    public void restituisciLibro(Libro libro, Utente utente) {

    }

    // stampaLibro
    public void stampaLibriDisponibili() {

    }

}
