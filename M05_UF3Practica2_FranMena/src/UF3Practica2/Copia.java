package UF3Practica2;

public class Copia extends Llibre {

    private String identificador;

    private String estat;

    public Copia(String nom, String tipus, String editorial, int any, Autor autor) {
        super(nom, tipus, editorial, any, autor);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
    
}
