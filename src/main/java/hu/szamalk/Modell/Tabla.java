package hu.szamalk.Modell;

public class Tabla {
    private String [][] t;
    private char UresCella;

    public Tabla(char uresCella) {
        this.t = new String[8][8];
        UresCella = uresCella;
    }
    
}
