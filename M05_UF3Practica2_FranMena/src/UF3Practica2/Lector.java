package UF3Practica2;


import UF3Practica2.Copia;
import java.util.List;

public class Lector {

    private int limitPrestec;

    private String nom;

    private String dni;

    private List<Copia> llibres;

    public Lector(int limitPrestec, String nom, String dni, List<Copia> llibres) {
        this.limitPrestec = limitPrestec;
        this.nom = nom;
        this.dni = dni;
        this.llibres = llibres;
    }

    public int getLimitPrestec() {
        return limitPrestec;
    }

    public void setLimitPrestec(int limitPrestec) {
        this.limitPrestec = limitPrestec;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Copia> getLlibres() {
        return llibres;
    }

    public void setLlibres(List<Copia> llibres) {
        this.llibres = llibres;
    }

    public void retornarLlibre() {
    }

    public void afegirLlibre() {
    }
    
}
