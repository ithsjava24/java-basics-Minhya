package org.example;

public class MinMaxMedel {

    public static void minMaxAvg(Pair[] prices) {

        Pair[] getPrices = prices;
        int min = getPrices[0].pris;
        int max = getPrices[0].pris;

        int minPrice = 0;
        int maxPrice = 0;
        int total = 0;

        for (int i = 0; i < getPrices.length; i++) {
            if (getPrices[i].pris < min) {
                min = getPrices[i].pris;
                minPrice = i;
            }
            if (getPrices[i].pris > max) {
                max = getPrices[i].pris;
                maxPrice = i;
            }
            total += getPrices[i].pris;
        }

        float medel = (float) total / 24;

        System.out.printf("Lägsta pris: %02d-%02d, %d öre/kWh\n", minPrice, minPrice + 1, min);
        System.out.printf("Högsta pris: %02d-%02d, %d öre/kWh\n", maxPrice, maxPrice + 1, max);
        System.out.printf("Medelpris: %.2f öre/kWh\n", medel);

    }

}