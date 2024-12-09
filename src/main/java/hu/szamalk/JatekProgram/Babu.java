package hu.szamalk.JatekProgram;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this.ero =1;
        this.szin = szin;
    }

    public Babu(String szin, int ero) {

        if (ero<1){
            System.out.println("Erő nem lehet kissebb mint 1!");
        } else if (ero>9) {
            System.out.println("Erő nem lehet nagyobb mint 9!");
        }
        else {
            this.ero = ero;
            this.szin = szin;
        }

    }
}
