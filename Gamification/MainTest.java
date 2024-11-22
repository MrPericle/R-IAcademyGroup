package Gamification;
import java.util.Random;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scannerInt = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        
        Login logger = new Login(new RegistroUtenti());
        
        
        //Opzioni menu
        stampaMenu();
        
        int optionMenu = scannerInt.nextInt();
        while (optionMenu<5){
            switch (optionMenu) {
                case 0:
                System.out.println("Login");
                System.out.println("Inserire username");
                String username = stringScanner.nextLine();
                System.out.println("Inserire password");
                String passwd = stringScanner.nextLine();
                logger.login(new Utente(username, passwd));
                break;
                case 1:
                    System.out.println("Registrazione");
                    logger.registrazione();
                    break;
                case 2:
                    logger.registroUtenti.stampaUtenti();
                    break;
                case 3:
                    System.out.println("Inserire username");
                    String searchUsername = stringScanner.nextLine();
                    System.out.println("Inserire password");
                    String searchPasswd = stringScanner.nextLine();
                    Utente toSearch = logger.registroUtenti.findUser(new Utente(searchUsername,searchPasswd));
                    if(toSearch != null){
                        toSearch.modifica();
                    }
                    break;
                    
                case 4:
                        Challenge aGame = new Challenge(logger.registroUtenti.utenti.get(rand.nextInt(logger.registroUtenti.utenti.size()))); 
                        aGame.game();
                    break;
                    
            }

        stampaMenu();
        optionMenu = scannerInt.nextInt();

    }



    }

    public static void stampaMenu(){

        System.out.println("Benvenuto! Scegli un opzione del menù:");
        System.out.println("0: Login");
        System.out.println("1: Registrazione");
        System.out.println("2: Visualizza utenti");
        System.out.println("3: Modifica dei dati utente");
        System.out.println("4: Prove matematiche");
        System.out.println("5: Esci");
        System.out.print("Inserisci un opzione: ");

    }
    
}
