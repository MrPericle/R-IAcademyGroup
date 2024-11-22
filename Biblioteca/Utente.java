package Biblioteca;

import java.util.ArrayList;

public class Utente {
    private String idUtente;
    private String nome;
    private ArrayList<Libro> libriNoleggiati = new ArrayList<>();

    public Utente(String idUtente, String nome) {
        this.idUtente = idUtente;
        this.nome = nome;
    }

    public Utente() {
    }

    public String getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(String idUtente) {
        this.idUtente = idUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Libro> getlibriNoleggiati() {
        return libriNoleggiati;
    }

    public void noleggiaLibro(Libro aLibro){
        libriNoleggiati.add(aLibro);
    }

    public void restituisciLibro(Libro aLibro){
        if(libriNoleggiati.contains(aLibro))
            libriNoleggiati.remove(aLibro);
        else
            System.out.println("Utente non possiede quel Libro.");
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idUtente == null) ? 0 : idUtente.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Utente other = (Utente) obj;
        if (idUtente == null) {
            if (other.idUtente != null)
                return false;
        } else if (!idUtente.equals(other.idUtente))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Utente [idUtente=" + idUtente + ", nome=" + nome + ", libriNoleggiati=" + libriNoleggiati + "]";
    }
    
    
}
