package org.example;

import static org.example.App.inmatat;

public class laddningstid {
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
