package Biblioteca;

public class Libro {
    private int numeroCopie;
    private String nome;
    private String anno;
    

    public Libro(String nome, String anno) {
        this.numeroCopie = 1;
        this.nome = nome;
        this.anno = anno;
    }

    public int getNumeroCopie() {
        return numeroCopie;
    }
    public void setNumeroCopie(int numeroCopie) {
        this.numeroCopie = numeroCopie;
    }

    public void incrementaNumeroCopie(int increment){
        if(increment>=1)
            this.numeroCopie += increment;
        else System.out.println("Incompatible increment value");
    }

    public void incrementaNumeroCopie(){
        this.numeroCopie++;
    }

    public void decrementaNumeroCopie(int increment){
        if(increment < 0)
            this.numeroCopie -= increment;
        else System.out.println("Incompatible increment value");
    }

    public void decrementaNumeroCopie(){
        this.numeroCopie--;
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

    public boolean isAvaliable(){
        return this.numeroCopie > 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((anno == null) ? 0 : anno.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anno == null) {
            if (other.anno != null)
                return false;
        } else if (!anno.equals(other.anno))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Libro [nome=" + nome + ", anno=" + anno + "Copie disponibili:"+this.numeroCopie+"]";
    }

    
}
