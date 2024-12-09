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
        tabla.Elhelyez(2);
        System.out.println("6.feladat");
        tabla.megjelenit();
        System.out.println("1.sor ures e?"+tabla.UresSor(1));
        System.out.println("3.oszlop ures e?"+tabla.UresOszlop(7));
        System.out.println("Ennyi üres sor van:" + tabla.uresSorDb());
        System.out.println("Ennyi üres oszlop van:" + tabla.uresOszlopDb());
    }
}