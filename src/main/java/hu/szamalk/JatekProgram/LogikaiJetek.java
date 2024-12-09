package hu.szamalk.JatekProgram;

import java.util.Arrays;

public class LogikaiJetek extends Jatek{
    private Babu [][]tabla;
    private int [] sorrend;
    private int babuDb;

    public LogikaiJetek() {
        this(3);
    }

    public LogikaiJetek(int babuDb) {
        if (babuDb>=2&babuDb<=15){
            this.babuDb = babuDb;
            tabla = new Babu[4][5];
            sorrend = new int[10];
        }
        else {
            System.out.println("2 és 15 között kell,hogy legyen");
        }
    }

    public boolean va8FelettEro(){
        boolean van = false;
        return van;
    }

    @Override
    public void kezdes() {
        System.out.println("Kezdés");
    }

    @Override
    public void ment() {
        System.out.println("Mentés");
    }

    @Override
    public void vege() {
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJetek"+getJatekDb()+"{" +
                "\ntabla=" + Arrays.toString(tabla) +
                ",\n sorrend=" + Arrays.toString(sorrend) +
                ",\n babuDb=" + babuDb +
                '}';
    }
}
