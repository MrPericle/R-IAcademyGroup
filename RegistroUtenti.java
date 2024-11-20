import java.util.ArrayList;

public class RegistroUtenti {

    ArrayList<Utente> utenti;
    public RegistroUtenti() {
       this.utenti= new ArrayList<Utente>();

    }



    public void aggiungiUtente(Utente ut){
       
        utenti.add(ut);
    }

    public void stampaUtenti(){
        for (Utente utente:utenti){
            utente.Stampa();
        }
    }



}
