import java.util.Scanner;

public class Login {

    public RegistroUtenti registroUtenti = new RegistroUtenti();
    public void registrazione(){
        Scanner myScannerS = new Scanner(System.in); // Create a Scanner object for string
        System.out.println("Enter username");
        String username = myScannerS.nextLine();

        // if(registroUtenti.contains(username)){
        //     System.out.println("Il nome" + username + "già esiste");
        // } else {
        //     registroUtenti.add(username);
        // }
        System.out.println("Enter password");
        String password = myScannerS.nextLine();
        Utente newUser = new Utente(username, password);

        /*
         * Possibilita di fare ciclo for e fare .equals()
         */

        if(!registroUtenti.utenti.contains(newUser)){

            registroUtenti.add(newUser);
        }

    }
    public boolean login(Utente user){
        int registrato = registroUtenti.utenti.indexOf(user);
        boolean retValue;
        if(registrato > 0 && !user.isLogged()){
            user.logged = true;
            retValue =  true;

        }

        else retValue = false;

        return retValue;
    }
}