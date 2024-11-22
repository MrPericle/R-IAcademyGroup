import java.util.Scanner;

public class Utente {

    Scanner scannerString = new Scanner(System.in);
    public String nome; // null
    public int punteggio; // Serve per il gioco
    public String passwd; // ?
    public boolean logged;

    // Utente u = new Utente()

    public Utente(String nome, String passwd) {
        this.nome = nome;
        this.punteggio = 0;
        this.passwd = passwd;
        this.logged = false;
    }

    public void Stampa() {
        if (this.logged) {
            System.out.println("Nome utente: " + nome);
        } else {
            System.out.println("L'UTENTE NON E' LOGGATO");
        }
    }

    public void modifica() {
        if (this.logged) {
            String scelta;
            System.out.println("DESIDERI MODIFICARE IL NOME UTENTE? [Y/N]");
            do {
                scelta = scannerString.nextLine();
            } while (!scelta.toUpperCase().equals("Y")  && !scelta.toUpperCase().equals("N"));
            if (scelta.equals("Y")) {
                String nuovonome = scannerString.nextLine();
                this.nome = nuovonome;
            }
            System.out.println("DESIDERI MODIFICARE LA PASSWORD? [Y/N]");
            do {
                scelta = scannerString.nextLine();
            } while (!scelta.toUpperCase().equals("Y")  && !scelta.toUpperCase().equals("N"));
            if (scelta.equals("Y")) {
                String nuovapasswd = scannerString.nextLine();
                this.passwd = nuovapasswd;
            }
        } else {
            System.out.println("L'UTENTE NON E' LOGGATO");
        }
    }

    public void modificaPunteggio(int punteggio) {
        if (this.logged){
            this.punteggio += punteggio;
        } else {
            System.out.println("L'UTENTE NON E' LOGGATO");
        }
    }

    public boolean isLogged() {
        return this.logged;
    }

    @Override
    public boolean equals(Object o){
        Utente compare = (Utente)o;
        if(this.nome.equals(compare.nome) && this.passwd.equals(compare.passwd))
            return true;
        else return false;
    }

}