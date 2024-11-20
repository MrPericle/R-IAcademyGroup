import java.util.Scanner;

public class Utente {
    
    Scanner scannerString = new Scanner(System.in);
    public String nome; //null
    public int punteggio; //Serve per il gioco 
    public String passwd; //?
    public boolean logged;

//Utente u = new Utente()    

    public Utente(String nome, String passwd) {
        this.nome = nome;
        this.punteggio = 0;
        this.passwd = passwd;
        this.logged = false;
    }

    public void Stampa(){
        System.out.println("Nome utente: " + nome);
    }

    public void modifica(){
        String scelta;
        System.out.println("DESIDERI MODIFICARE IL NOME UTENTE? [Y/N]");
        do {
            scelta = scannerString.nextLine();
        } while (scelta.toUpperCase() != "Y" || scelta.toUpperCase() != "N");
        if (scelta == "Y") {
            String nuovonome = scannerString.nextLine();
            this.nome = nuovonome;
        }
        System.out.println("DESIDERI MODIFICARE LA PASSWORD? [Y/N]");
        do {
            scelta = scannerString.nextLine();
        } while (scelta.toUpperCase() != "Y" || scelta.toUpperCase() != "N");
        if (scelta == "Y") {
            String nuovapasswd = scannerString.nextLine();
            this.passwd = nuovapasswd;
        }
    }

    public void modificaPunteggio(int punteggio){
        this.punteggio += punteggio;
    }

    public boolean isLogged(){
        return this.logged;
    }

    
    
}