import java.util.Random;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scannerInt = new Scanner(System.in);
        
        Login logger = new Login(new RegistroUtenti());
        Challenge aGame = new Challenge(logger.registroUtenti.utenti.get(rand.nextInt(logger.registroUtenti.utenti.size()))); 

        
        //Opzioni menu
        stampaMenu();

        int optionMenu = scannerInt.nextInt();
         while (optionMenu<4){
            switch (optionMenu) {
                case 0:
                    
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                
                case 4:
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
