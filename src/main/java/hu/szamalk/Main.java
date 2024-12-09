package hu.szamalk;

import hu.szamalk.modell.AdatSzerkezet;
import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla T = new Tabla('#');
        T.Megjelenit();
        T.Elhelyez();

        AdatSzerkezet adat = new AdatSzerkezet();
        System.out.println("Név és 10 betű:");
        System.out.println(adat.nevMegjelenit());
        System.out.println(adat.abcMegjelenit());
        adat.betuMennyisege();

    }
}