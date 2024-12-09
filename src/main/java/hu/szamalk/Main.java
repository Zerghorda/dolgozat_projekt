package hu.szamalk;

import hu.szamalk.Modell.Tabla;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Tabla tabla = new Tabla("*");
        tabla.tablaTolt();
        tabla.megjelenit();
    }
}