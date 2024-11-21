import java.util.Random;
import java.util.Scanner;

public class Challenge {
/*Una serie di prove matematiche di difficoltà crescente (3 difficoltà: Somme,
divisioni, molt   [controllo risultati INT]) ogni risposta giusta assegnerà X
punti ogni risposta sbagliata li farà perdere se perdi troppo veri rimosso
dalla possibilità dio giocare, se indovini potrai accedere alle difficoltà
superiori  */

    public Utente user; 
    Random rand = new Random();
    Scanner intScanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner(System.in);

    public Challenge(Utente gamer){
        
        this.user = gamer;
    }

    public boolean level1Challenge(){
        System.out.println("Prova di difficolta 1");
        System.out.println("Addizioni");
        boolean haPerso = false;
        int addendo1 = rand.nextInt(150);
        int addendo2 = rand.nextInt(150);
        int soluzione = addendo1+addendo2;
        int userSolution;

        System.out.println("Quanto fa "+addendo1+"+"+addendo2);
        userSolution = intScanner.nextInt();

        if(userSolution==soluzione){
            System.out.println("Congratulazione, hai guadagnato 10 punti");
            this.user.modificaPunteggio(10);
        }
        else{
            System.out.println("La soluzione non e corretta. Hai perso 10 punti");
            this.user.modificaPunteggio(-10);

        }

        if(this.user.punteggio<0){
            haPerso = true;
        }

        return haPerso;
    }

    public boolean level2Challenge(){
        System.out.println("Prova di difficolta 2");
        System.out.println("Moltiplicazioni");
        boolean haPerso = false;
        int addendo1 = rand.nextInt(10);
        int addendo2 = rand.nextInt(10);
        int soluzione = addendo1*addendo2;
        int userSolution;

        System.out.println("Quanto fa "+addendo1+"*"+addendo2);
        userSolution = intScanner.nextInt();

        if(userSolution==soluzione){
            System.out.println("Congratulazione, hai guadagnato 10 punti");
            this.user.modificaPunteggio(10);
        }
        else{
            System.out.println("La soluzione non e corretta. Hai perso 10 punti");
            this.user.modificaPunteggio(-10);

        }

        if(this.user.punteggio<0){
            haPerso = true;
        }

        return haPerso;
    }

    public boolean level3Challenge(){
        System.out.println("Prova di difficolta 2");
        System.out.println("Cultura");
        boolean haPerso = false;
        String soluzione = "Mace Windu";
        String userSolution;

        System.out.println("Chi uccide Jango Fett ne \"La guerra dei clone\" ");
        userSolution = stringScanner.nextLine();

        if(userSolution.equals(soluzione)){
            System.out.println("Congratulazione, hai guadagnato 10 punti");
            this.user.modificaPunteggio(10);
        }
        else{
            System.out.println("La soluzione non e corretta. Hai perso 10 punti");
            this.user.modificaPunteggio(-40);

        }

        if(this.user.punteggio<0){
            haPerso = true;
        }

        return haPerso;
    }

    public void game(){
        if(user.isLogged()){
            boolean lost = level1Challenge();
            if(!lost){
                lost = level2Challenge();
                if(!lost){
                    lost = level3Challenge();
                    if(!lost){
                        System.out.println("Hai vinto!");
                    }
                    else{
                        System.out.println("Peccato, eri vicino...");
                    }
                }
                else{
                    System.out.println("Peccato, eri a meta strada");
                }
            }
            else{
                System.out.println("Grave");
            }
        }
    }
}
