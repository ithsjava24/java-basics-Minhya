package org.example;

public class MinMaxMedel {


    public static void minMaxAvg(Pair[] prices) {

        int min = prices[0].pris;
        int max = prices[0].pris;

        int minPrice = 0;
        int maxPrice = 0;
        int total = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i].pris < min) {
                min = prices[i].pris;
                minPrice = i;
            }
            if (prices[i].pris > max) {
                max = prices[i].pris;
                maxPrice = i;
            }
            total += prices[i].pris;
        }

        float medel = (float) total / 24;

        System.out.printf("Lägsta pris: %02d-%02d, %d öre/kWh\n", minPrice, minPrice + 1, min);
        System.out.printf("Högsta pris: %02d-%02d, %d öre/kWh\n", maxPrice, maxPrice + 1, max);
        System.out.printf("Medelpris: %.2f öre/kWh\n", medel);

    }

}