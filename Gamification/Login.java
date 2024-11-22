import java.util.Scanner;

public class Login {

    public Login(RegistroUtenti registroUtenti) {
        this.registroUtenti = registroUtenti;
    }


    public RegistroUtenti registroUtenti = new RegistroUtenti();
    public void registrazione(){
        Scanner myScannerS = new Scanner(System.in); // Create a Scanner object for string
        System.out.println("Enter username");
        String username = myScannerS.nextLine();
        
        System.out.println("Enter password");
        String password = myScannerS.nextLine();
        if(this.registroUtenti.utenti.contains(username)){
            System.out.println("Il nome" + username + "già esiste");
        } else {
            System.out.println("Registrazione di "+username+" con passwd "+password+" completata.");
            this.registroUtenti.add(new Utente(username, password));
        }
        
    }


    public boolean login(Utente user){
        int registrato = registroUtenti.utenti.indexOf(user);
        Utente toLog = registroUtenti.utenti.get(registrato);
        System.out.println("registrato->"+registrato);
        boolean retValue;
        if(registrato >= 0 && !toLog.isLogged()){
            System.out.println("Logged in");
            toLog.logged = true;
            retValue =  true;

        }
        else {
            System.out.println("Unable to login");
            retValue = false;
        
        }

        return retValue;
    }
}
