package Biblioteca;

public class Libro {
    private int numeroCopie;
    private String nome;
    private String anno;

    

    public Libro(int numeroCopie, String nome, String anno) {
        this.numeroCopie = numeroCopie;
        this.nome = nome;
        this.anno = anno;
    }
    
    public int getNumeroCopie() {
        return numeroCopie;
    }
    public void setNumeroCopie(int numeroCopie) {
        this.numeroCopie = numeroCopie;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAnno() {
        return anno;
    }
    public void setAnno(String anno) {
        this.anno = anno;
    }

    
}
