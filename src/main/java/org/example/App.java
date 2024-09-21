package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static org.example.App.inmatning.askPrices;
import static org.example.App.inmatning.gasPrices;
import static org.example.App.laddningstid.chargeTime;
import static org.example.App.minmaxmedel.minMaxMedel;
import static org.example.App.sortera.sorteraPrice;

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
                    System.out.printf("Måste mata in priser först.\n");}}
                case "3" -> {if(inmatat){sorteraPrice();
                }else{
                    System.out.printf("Måste mata in priser först\n");}}
                case "4" -> {if(inmatat){chargeTime(askPrices);
                }else{
                    System.out.printf("Måste mata in priser först.\n");}}
                case "e" -> {
                        running = false;
                        System.out.printf("Programmet avslutas.");
                    }
                default -> System.out.printf("Ange rätt inmatning från menyn.\n");

                }

            }

    }


    public static class inmatning {
        static int[] askPrices = new int[12];

        public static int[] gasPrices() {
            Scanner in = new Scanner(System.in);
            System.out.print("Mata in elpriserna för dygnet i ören per kWh (24 timmar): \n");

            for (int i = 0; i < askPrices.length; i++) {
                System.out.printf("Pris för timme %02d-%02d: ", i, i + 1);
                askPrices[i] = in.nextInt();
            }
            inmatat =true;
            return askPrices;

        }
    }

    public static class laddningstid {
        public static void chargeTime(int[] askPrices) {
            int[] getPrices = askPrices;
            int cheapestStart = 0;
            int cheapestPrice = Integer.MAX_VALUE;

            for (int i = 0; i < getPrices.length - 3; i++) {
                int total = getPrices[i] + getPrices[i + 1] + getPrices[i + 2] + getPrices[i + 3];
                if (total < cheapestPrice) {
                    cheapestPrice = total;
                    cheapestStart = i;
                }

            }
            System.out.printf("Bästa laddningstid: %02d-%02d\n", cheapestStart, cheapestStart + 4);

        }
    }

    public static class minmaxmedel {

        public static void minMaxMedel() {

          int[] getPrices = askPrices;
          int min = getPrices[0];
          int max = getPrices[0];

          int minPrice = 0;
          int maxPrice = 0;
          int total = 0;

          for (int i = 0; i < getPrices.length; i++) {
              if (getPrices[i] < min) {
                  min = getPrices[i];
                  minPrice = i;
              }
              if (getPrices[i] > max) {
                  max = getPrices[i];
                  maxPrice = i;
              }
              total += getPrices[i];
          }

          float medel = (float) total /24;

            System.out.printf("Minsta pris: %d öre (timme %02d-%02d)\n", min, minPrice, minPrice + 1);
            System.out.printf("Högsta pris: %d öre (timme %02d-%02d)\n", max, maxPrice, maxPrice + 1);
            System.out.printf("Medelpris: %.2f öre\n", medel);

        }

    }

    public static class sortera {
        public static void sorteraPrice() {
            int[] sortedPrice = askPrices.clone();
            Arrays.sort(sortedPrice);

            System.out.printf("Priser sorterade från dyrast till billigast: \n");
            for (int i = 0; i < sortedPrice.length; i++) {
                int price = sortedPrice[i];
                for (int j = 0; j < askPrices.length; j++) {
                    if (askPrices[j] == price) {
                        System.out.printf("%02d-%02d %d öre\n", j, j + 1, askPrices[j]);
                        askPrices[j] = -1;
                        break;
                    }
                }
            }
        }
    }
}
