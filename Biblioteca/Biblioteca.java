package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    ArrayList<Libro> libridisponibili = new ArrayList<Libro>();
    ArrayList<Libro> librinoleggiati = new ArrayList<Libro>();

    // aggiungi ibro
    public void aggiungiLibro(Libro libro){
        
    
            libridisponibili.add(libro);
            System.out.println("Libro aggiunto alla biblioteca: " + libro.getNome());

        }




    // rimuovi libro
    public void rimuoviLibro(Libro libro, int numeroCopieDaRimuovere) {
        if (libridisponibili.isEmpty()) {
            System.out.println("Nessun libro è presente nella biblioteca!");
        } else {
            if (libridisponibili.contains(libro)) {
                libro.decrementaNumeroCopie(numeroCopieDaRimuovere);
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

    //restituisci libro
    public void restituisciLibro(Libro libro, Utente utente){
        if (librinoleggiati.isEmpty()) {
            System.out.println("Nella libreria nessun libro è stato noleggiato");
        } else {
            Scanner scannerstring = new Scanner(System.in);
            if (utente.getlibriNoleggiati().isEmpty()) {
                System.out.println("L'utente non ha libri noleggiati");
            } else {
                System.out.println("Quale libro vuoi restituire?");
                for (int i=0; i<utente.getlibriNoleggiati().size(); i++){
                    System.out.println(i + "0 - " + "[" + utente.getlibriNoleggiati().get(i) + "]");
                }
                int scelta = scannerstring.nextInt();
                utente.restituisciLibro(libro);
                libro.incrementaNumeroCopie();
            }
        }
    }

    // stampaLibro

    public void stampaLibriDisponibili() {
        if (libridisponibili.isEmpty()) {
            System.out.println("Nessun libro è presente nella biblioteca!");
        } else {
            System.out.println("I libri disponibili in biblioteca sono:");
            for (Libro lib : libridisponibili) {
                System.out.println(lib.toString() + "Numero copie disponibili: " + lib.getNumeroCopie());
            }
        }
    }
}
