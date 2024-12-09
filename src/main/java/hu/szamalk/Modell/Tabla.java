package hu.szamalk.Modell;

import java.util.Arrays;
import java.util.Random;

public class Tabla {
    private String [][] t;
    private String UresCella;

    public Tabla(String uresCella) {
        this.t = new String[8][8];
        UresCella = uresCella;
    }
    //3. feladat 3.része
    public void tablaTolt(){
        for (int i =0;i<t.length;i++){
            for (int j = 0;j<t[i].length;j++){
                Arrays.fill(t[j], this.UresCella);
            }
        }
    }
    //4.feladat
    public void megjelenit(){
        for (int i =0;i< t.length;i++){
            for (int j = 0;j< t[i].length;j++){
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
    }
    public void Elhelyez(int db){
        System.out.println("5. feladat:");
        String kiralyno = "K";
        for (int i = 0;i <db;i++){
            int sorOszlop = (int) Math.floor(Math.random()*9-1);
            t[sorOszlop][sorOszlop] = kiralyno;
        }
    }


}
