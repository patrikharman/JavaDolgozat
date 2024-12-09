package hu.szamalk.modell;

import java.util.*;
import java.util.Random;


public class AdatSzerkezet {
    private List<Character> nev;
    private Set<String> abcSet;
    private Random rn = new Random();



    public AdatSzerkezet() {
        nev = new ArrayList<>();
        abcSet = new TreeSet<>();
        this.rn = rn;

        nev.add('P');
        nev.add('A');
        nev.add('T');
        nev.add('R');
        nev.add('I');
        nev.add('K');

        abcSet.add("L");
        abcSet.add("B");
        abcSet.add("W");
        abcSet.add("D");
        abcSet.add("E");
        abcSet.add("S");
        abcSet.add("G");
        abcSet.add("P");
        abcSet.add("I");
        abcSet.add("J");
    }

    public String nevMegjelenit() {
        String eredmeny = "";
        for (Character c : nev) {
            eredmeny += c+",";
        }
        return eredmeny;
    }
    public String abcMegjelenit() {
        String eredmeny = "";
        for (String betu : abcSet) {
            eredmeny += betu.toLowerCase()  + ",";
        }
        return eredmeny;
    }

    public void randomBetuk() {
        String[] betuk = {"P", "B", "Z", "D", "E", "F", "O", "H", "I", "J"};
        for (int i = 0; i < 5; i++) {
            String randomBetu = betuk[rn.nextInt(betuk.length)];
            abcSet.add(randomBetu);
        }
    }

    public void betuMennyisege() {
        Map<String, Integer> betuDb = new HashMap<>();
        for (String betu : abcSet) {
            betuDb.put(betu, betuDb.getOrDefault(betu, 0) + 1);
        }
        System.out.println("Betűk mennyisége:"+betuDb);
    }

}
