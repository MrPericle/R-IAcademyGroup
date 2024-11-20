public class Utente {
    public String nome;
    public int punteggio;
    public String passwd; //?

    

    public Utente(String nome, String passwd) {
        this.nome = nome;
        this.punteggio = 0;
        this.passwd = passwd;
    }

    public void Stampa(){
        //....
    }

    public void modifica(){

    }

    public void modificaPunteggio(int punteggio){
        this.punteggio += punteggio;
    }
    
}


