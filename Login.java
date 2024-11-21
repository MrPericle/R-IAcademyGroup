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
        if(registroUtenti.utenti.contains(username)){
            System.out.println("Il nome" + username + "già esiste");
        } else {
            registroUtenti.add(new Utente(username, password));
        }
        
    }


    public boolean login(Utente user){
        int registrato = registroUtenti.utenti.indexOf(user);
        boolean retValue;
        if(registrato >= 0 && !user.isLogged()){
            user.logged = true;
            retValue =  true;

        }

        else retValue = false;

        return retValue;
    }
}
