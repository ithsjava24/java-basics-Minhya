package org.example;

import java.util.Locale;
import java.util.Scanner;

import static org.example.Inmatning.inputPrices;
import static org.example.Laddningstid.chargeTime;
import static org.example.MinMaxMedel.minMaxAvg;
import static org.example.Sortera.sortedPrice;
import static org.example.Visualisering.visual;


public class App {
    public static boolean inputVerification = false;


    public static void main(String[] args) {
        Pair[] prices = new Pair[24];
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
                    5. Visualisering
                    e. Avsluta
                    """);
            String menu = scanner.nextLine();

            switch (menu.toLowerCase()) {
                case "1" -> prices = inputPrices(scanner, prices);
                case "2" -> {
                    if (inputVerification) {
                        minMaxAvg(prices);
                    } else {
                        System.out.print("Måste mata in priser först.\n");
                    }
                }
                case "3" -> {
                    if (inputVerification) {
                        sortedPrice(prices);
                    } else {
                        System.out.print("Måste mata in priser först\n");
                    }
                }
                case "4" -> {
                    if (inputVerification) {
                        chargeTime(prices);
                    } else {
                        System.out.print("Måste mata in priser först.\n");
                    }
                }
                case "5" -> {
                    if (inputVerification) {
                        visual(prices);
                    } else {
                        System.out.print("Måste mata in priser först.\n");
                    }
                }
                case "e" -> {
                    running = false;
                    System.out.print("Programmet avslutas.");
                }
                default -> System.out.print("Ange rätt inmatning från menyn.\n");

            }

        }

    }
}
