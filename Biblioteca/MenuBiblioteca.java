package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBiblioteca {
        //Classe che gestisce il menu del sistema
    
    public Scanner intScanner = new Scanner(System.in);
    public Scanner stringScanner = new Scanner(System.in);

    public Biblioteca miaBiblioteca = new Biblioteca();
    public ArrayList<Utente> userList = new ArrayList<>();

    public Utente loggedUser = null;

    public boolean menuHandler(int choice){
        //metodo che gestisce, in base alle scelte dell'utente, i metodi da invocare per gestire le richieste
        boolean running = true;
        switch (choice) {
            case 1:
                System.out.print("Nome Libro>>");
                String nomeLibroAggiunta = stringScanner.nextLine();
                System.out.println();
                System.out.print("Anno uscita>>");
                String dataUscitaAggiunta = stringScanner.nextLine();
                System.out.println();
                System.out.print("Numero copie>>");
                int numeroCopieDaInserire = intScanner.nextInt();
                if(loggedUser!= null)
                    miaBiblioteca.aggiungiLibro(new Libro(nomeLibroAggiunta,dataUscitaAggiunta),numeroCopieDaInserire);
                else System.out.println("Login required");
                
                break;
            case 2:
                System.out.print("Nome Libro>>");
                String nomeLibroRimuovere = stringScanner.nextLine();
                System.out.println();
                System.out.print("Anno uscita>>");
                String dataUscitaRimuovere = stringScanner.nextLine();
                System.out.println();
                System.out.print("Numero copie>>");
                int numeroCopieDaRimuovere = intScanner.nextInt();
                if(loggedUser!= null)
                    miaBiblioteca.rimuoviLibro(new Libro(nomeLibroRimuovere,dataUscitaRimuovere),numeroCopieDaRimuovere);
                else System.out.println("Login required");
                break;

            case 3:
                System.out.print("ID utente>>");
                String idUtenteAggiungere = stringScanner.nextLine();
                System.out.println();
                System.out.print("Nome utente>>");
                String nomeUtenteAggiungere = stringScanner.nextLine();
                System.out.println();
                Utente possibileUtente = new Utente(idUtenteAggiungere, nomeUtenteAggiungere);
                if(!userList.contains(possibileUtente)){
                    userList.add(new Utente(idUtenteAggiungere, nomeUtenteAggiungere));
                    System.out.println("Utente aggiunto correttamente."); 
                    System.out.println();
                }
                else{
                    System.out.println("Utente gia registrato.");
                }
                break;
            case 4:
                System.out.print("ID utente>>");
                String idUtenteDaLoggare = stringScanner.nextLine();
                System.out.println();
                System.out.print("Nome utente>>");
                String nomeUtenteDaLoggare = stringScanner.nextLine();
                System.out.println();
                Utente possibileUtenteDaLoggare = new Utente(idUtenteDaLoggare, nomeUtenteDaLoggare);
                if(userList.contains(possibileUtenteDaLoggare)){
                    loggedUser = possibileUtenteDaLoggare;
                    System.out.println("Utente loggato."); 
                    System.out.println();
                }
                else{
                    System.out.println("Utente non registrato.");
                }
                break;
            
            case 5:
                System.out.print("Nome Libro>>");
                String nomeLibroNoleggio = stringScanner.nextLine();
                System.out.println();
                System.out.print("Anno uscita>>");
                String dataUscitaNoleggio = stringScanner.nextLine();
                System.out.println();
                if(loggedUser!=null){
                    miaBiblioteca.prestaLibro(new Libro(nomeLibroNoleggio, dataUscitaNoleggio),loggedUser);
                }
                else 
                    System.out.println("Utente non trovato. Impossibile concedere il noleggio.");
                break;
            case 6:
                
            if(loggedUser!=null){
                for (Libro libroNoleg : loggedUser.getlibriNoleggiati()) {
                    System.out.println(libroNoleg);
                }
                System.out.println();
                System.out.print("Nome Libro>>");
                String nomeLibroRestituzione = stringScanner.nextLine();
                System.out.println();
                System.out.print("Anno uscita>>");
                String dataUscitaRestituzione = stringScanner.nextLine();
                System.out.println();
                    miaBiblioteca.restituisciLibro(new Libro(nomeLibroRestituzione, dataUscitaRestituzione),loggedUser);
                }
                else 
                    System.out.println("Utente non trovato. Impossibile concedere il noleggio.");
                break;
            case 7:
                System.out.println(miaBiblioteca);
                break;
            case 8:
                System.out.println(loggedUser);
                
                break;
            // case 8:
            //     System.out.print("Premere 1 per cercare per nome; premere 2 per cercare per data>>");
            //     int searchCoice = intScanner.nextInt();
            //     while (searchCoice != 1 && searchCoice != 2) {
            //         System.out.println("Inserire una opzione valida");
            //         System.out.print("Premere 1 per cercare per nome; premere 2 per cercare per data>>");
            //         searchCoice = intScanner.nextInt();
            //     }

            //     switch (searchCoice) {
            //         case 1:
            //             System.out.print("Nome Libro>>");
            //             String nomeLibroNRicerca = stringScanner.nextLine();
            //             System.out.println();
            //             miaBiblioteca.searchByName(nomeLibroNRicerca);
            //             break;
            //         case 2:
            //             System.out.print("Nome Libro>>");
            //             String dataLibroNRicerca = stringScanner.nextLine();
            //             System.out.println();
            //             miaBiblioteca.searchByDate(dataLibroNRicerca);
            //             break;
            //         default:
            //             break;
            //     }
            //     break;
            case 0:
                running = false;
                break;
            default:
                System.out.println("Invalid choice");;
        }
        return running;
    }

    public void menuPrinter(){
        //Metodo che stampa il menu.

        int choice=0;
        boolean running = true;
        
        System.out.println("Menu biblioteca:");
        
        while(running){
            System.out.println("1. Aggiungi Libro");
            System.out.println("2. Rimuovi Libro");
            System.out.println("3. Aggiungi utente");
            System.out.println("4. Login");
            System.out.println("5. Noleggio Libro");
            System.out.println("6. Restituisci Libro");
            System.out.println("7. Lista Libro");
            System.out.println("8. Lista Libro noleggiati");
            //System.out.println("9. Ricerca Libro");
            System.out.println("0. Esci");

            
            choice = intScanner.nextInt();
            
            running = menuHandler(choice);

        }
        System.out.println("Chiusura menu...");
        intScanner.close();
        stringScanner.close();
    }
}
    

