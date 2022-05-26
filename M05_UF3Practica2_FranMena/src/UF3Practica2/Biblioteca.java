package UF3Practica2;

import java.util.List;

public class Biblioteca {

    private List<Copia> copies;

    public Biblioteca(List<Copia> copies) {
        this.copies = copies;
    }

    public List<Copia> getCopies() {
        return copies;
    }

    public void setCopies(List<Copia> copies) {
        this.copies = copies;
    }
    
}
