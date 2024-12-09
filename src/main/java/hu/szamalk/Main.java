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
        tabla.Elhelyez(6);
        System.out.println("6.feladat");
        tabla.megjelenit();
        System.out.println("1.sor ures e?"+tabla.UresSor(1));
        System.out.println("3.oszlop ures e?"+tabla.UresOszlop(7));
        System.out.println("9.feladat: üres oszlopok és sorkok száma:");
        System.out.println("Oszlopok:" +tabla.uresOszlopDb() );
        System.out.println("Sorok:" +tabla.uresSorDb() );
    }
}