package hu.szamalk.JatekProgram;

public abstract class Jatek {
    private static int jatekDb=0;

    public static int getJatekDb() {
        jatekDb = jatekDb+1;
        return jatekDb;
    }
    public void kezdes(){

    }
    public void ment(){}
    public void vege(){}
}
