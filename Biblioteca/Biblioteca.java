package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Libro> libridisponibili = new ArrayList<Libro>();
    ArrayList<Libro> librinoleggiati = new ArrayList<Libro>();

    // aggiungi ibro
    public void aggiungiLibro(Libro libro){
        
    
            libridisponibili.add(libro);
            System.out.println("Libro aggiunto alla biblioteca: " + libro.getNome());

        }

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
    public void prestaLibro(Libro libro, Utente utente){

        if (libridisponibili.contains(libro)){
            ArrayList<Libro> libri = utente.getlibriNoleggiati();
            if (libri.contains(libro)){
                System.out.println("Libro già noleggiato, non è possibile noleggiarlo nuovamente");
            } else {
                utente.noleggiaLibro(libro);
                librinoleggiati.add(libro);
                libro.decrementaNumeroCopie();
                if (libro.getNumeroCopie() == 0){
                    libridisponibili.remove(libro);
                }
            }
        } else {
            System.out.println("Libro non disponibile!");
        }


    }

    // restituisci libro
    public void restituisciLibro(Libro libro, Utente utente) {

    }

    // stampaLibro
    public void stampaLibriDisponibili() {

    }

}
