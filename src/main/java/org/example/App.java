package org.example;

import java.util.Locale;
import java.util.Scanner;

import static org.example.inmatning.askPrices;
import static org.example.inmatning.gasPrices;
import static org.example.laddningstid.chargeTime;
import static org.example.minmaxmedel.minMaxMedel;
import static org.example.sortera.sorteraPrice;

public class App {

    public static boolean inmatat = false;

    public static void main(String[] args) {
        Locale locale = Locale.of("sv", "SE");
        Locale.setDefault(locale);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        while (running) {
            System.out.print("""
                Elpriser
                ========
                1. Inmatning
                2. Min, Max och Medel
                3. Sortera
                4. Bästa Laddningstid (4h)
                e. Avsluta
                """);
            String menu = scanner.nextLine().toLowerCase();

            switch (menu) {
                case "1" -> gasPrices();
                case "2" ->{if(inmatat){minMaxMedel();
                }else{
                    System.out.printf("Måste mata in först.\n");}}
                case "3" -> {if(inmatat){sorteraPrice();
                }else{
                    System.out.printf("Måste mata in först.\n");}}
                case "4" -> {if(inmatat){chargeTime(askPrices);
                }else{
                    System.out.printf("Måste mata in först.\n");}}
                case "e" -> {
                        running = false;
                        System.out.printf("Avslutas");
                    }
                default -> System.out.printf("Ange rätt inmatning från menyn.\n");

                }

            }

    }

}
