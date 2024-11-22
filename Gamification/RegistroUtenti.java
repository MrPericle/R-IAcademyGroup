import java.util.ArrayList;

public class RegistroUtenti {

    ArrayList<Utente> utenti;
    public RegistroUtenti() {
       this.utenti= new ArrayList<Utente>();

    }




    public void add(Utente ut){
       
        utenti.add(ut);
    }

    public void stampaUtenti(){
        for (Utente utente:utenti){
            utente.Stampa();
        }
    }

    public Utente findUser(Utente user){
        Utente retUtente = null;
        if(utenti.contains(user)){
            System.out.println("Utente trovato");
            retUtente = utenti.get(utenti.indexOf(user));
        }
        return retUtente;
    }



}
