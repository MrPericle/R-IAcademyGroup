import java.util.ArrayList;

public class RegistroUtenti {

    ArrayList<Utente> utenti;
    public RegistroUtenti() {
       this.utenti= new ArrayList<Utente>();

    }



    public void registrazione(Utente ut){
       
        utenti.add(ut);
    }



}
