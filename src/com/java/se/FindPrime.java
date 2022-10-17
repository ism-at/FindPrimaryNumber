package com.java.se;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie das Limit: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        List<Integer> Primarzahlen = new ArrayList<>();

        for (int checkZahl = 2; checkZahl <= limit; checkZahl++) {
            boolean istPrime = true;
            for (int gechecktZahl = 2; gechecktZahl <= checkZahl/2; gechecktZahl++) {
                if (checkZahl % gechecktZahl == 0){
                    istPrime = false;
                    break;
                }
            }
            if (istPrime){ // Hier sind wir in erste Schleife und istPrime = true, d.h. Primär zahl
                Primarzahlen.add(checkZahl);
            }
        }
        System.out.println("Die Primär Zahlen von  1 - " + limit);
        // Klassische for Loop
        /*for (int zahl =0; zahl <= Primarzahlen.size(); zahl++) {
            System.out.println(zahl);
        }*/
        // For each loop
        for (int zahl:Primarzahlen) {
            System.out.println(zahl);
        }
    }
}
