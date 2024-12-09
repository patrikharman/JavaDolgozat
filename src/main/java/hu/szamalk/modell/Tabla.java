package hu.szamalk.modell;

import java.util.Arrays;

public class Tabla {
    private char[][] T;
    private char UresCella;

    public Tabla(char UresCella) {
        this.T = new char[8][8];
        this.UresCella = UresCella;

        feltolt();


    }

    private void feltolt() {
        for (int i = 0; i < T.length; i++) {
            Arrays.fill(T[i], UresCella);
        }
    }


    public void Elhelyez(){

    }

    public void FajlbaIr(){

    }

    public void Megjelenit(){
        for (char[] sor : T) {
            for (char cella : sor) {
                System.out.print(cella + "");
            }
            System.out.println();
        }

    }

    public void Tabla(){

    }

    public void UresOszlop(){

    }

    public void UresSor(){

    }
}
