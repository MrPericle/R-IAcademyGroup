import java.util.Scanner;

public class Utente {
    Scanner scannerstring = new Scanner(System.in);
    public String nome;
    public int punteggio;
    public String passwd; //?

    

    public Utente(String nome, String passwd) {
        this.nome = nome;
        this.punteggio = 0;
        this.passwd = passwd;
    }

    public void Stampa(){
        System.out.println("Nome utente: " + nome);
    }

    public void modifica(){
        String scelta;
        System.out.println("DESIDERI MODIFICARE IL NOME UTENTE? [Y/N]");
        do {
            scelta = scannerstring.nextLine();
        } while (scelta.toUpperCase() != "Y" || scelta.toUpperCase() != "N");
        if (scelta == "Y") {
            String nuovonome = scannerstring.nextLine();
            this.nome = nuovonome;
        }
        System.out.println("DESIDERI MODIFICARE LA PASSWORD? [Y/N]");
        do {
            scelta = scannerstring.nextLine();
        } while (scelta.toUpperCase() != "Y" || scelta.toUpperCase() != "N");
        if (scelta == "Y") {
            String nuovapasswd = scannerstring.nextLine();
            this.passwd = nuovapasswd;
        }
    }

    public void modificaPunteggio(int punteggio){
        this.punteggio += punteggio;
    }
    
}