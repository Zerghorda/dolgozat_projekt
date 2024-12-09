package hu.szamalk.Modell;

import java.util.Arrays;

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
    //5.feladat
    public void Elhelyez(int db){
        String kiralyno = "K";
        for (int i = 0;i <db;i++){
            int sor = (int) Math.floor(Math.random()*8-1)+1;
            int oszlop = (int) Math.floor(Math.random()*8-1)+1;
            while(t[sor][oszlop].equals(UresCella))
                t[sor][oszlop] = kiralyno;
            }
        }

    public  boolean UresOszlop(int oszlop){
        int i =0;
        oszlop =oszlop-1;
       boolean ures = true;
        while(i < oszlop && ures ){
            if (t[oszlop][i].equals("K")){
                ures = false;
            }
            i++;
        }
       return ures;
    }
    public boolean UresSor(int sor){
        int i =0;
        sor = sor-1;
        boolean ures = false;
        while(i < sor && ures ){
            if (t[sor][i].equals("K")){
                ures = true;
            }
            i++;
        }
        return ures;
    }
    public int uresSorDb(){
        int db = 0;
        for (int i = 0;i< 8;i++) {
            if (UresSor(i)){
                db++;
            }
        }
        return db;
    }
    public int uresOszlopDb(){
        int db = 0;
        for (int i = 0;i< 7;i++) {
            if (UresOszlop(i)){
                db++;
            }
        }
        return db;
    }

}
