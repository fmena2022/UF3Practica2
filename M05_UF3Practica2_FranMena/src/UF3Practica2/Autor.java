package UF3Practica2;


import java.time.LocalDate;

public class Autor {

    private String nacionalitat;

    private LocalDate dataNaixement;

    private String nom;

    public Autor(String nacionalitat, LocalDate dataNaixement, String nom) {
        this.nacionalitat = nacionalitat;
        this.dataNaixement = dataNaixement;
        this.nom = nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
