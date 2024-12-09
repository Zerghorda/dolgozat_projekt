package hu.szamalk.JatekProgram;

public class Program {
    public static void main(String[] args) {
        LogikaiJetek j = new LogikaiJetek();
        System.out.println(j.toString());
        j = new LogikaiJetek(16);
        j = new LogikaiJetek(10);
        System.out.println(j.toString());

    }
}
