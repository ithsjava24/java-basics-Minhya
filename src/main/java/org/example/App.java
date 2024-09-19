package org.example;

import java.util.Locale;
import java.util.Scanner;

public class App {


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
                case "1" -> System.out.println("Måndag");
                case "2" -> System.out.printf("2");
                case "3" -> System.out.printf("3");
                case "4" -> System.out.printf("4");
                case "e" -> {
                    running = false;
                    System.out.printf("Avslutas");
                }
                default -> System.out.printf("Ange rätt inmatning från menyn.\n");
            };

        }
        //int menu = 0;

    }
}
