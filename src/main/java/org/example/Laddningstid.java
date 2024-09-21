package org.example;

public class Laddningstid {

    public static void chargeTime(Pair[] askPrices) {
        int cheapestStart = 0;
        int cheapestPrice = Integer.MAX_VALUE;

        for (int i = 0; i < askPrices.length - 3; i++) {
            int total = askPrices[i].pris + askPrices[i + 1].pris + askPrices[i + 2].pris + askPrices[i + 3].pris;
            if (total < cheapestPrice) {
                cheapestPrice = total;
                cheapestStart = i;
            }
        }
        float medelCheapestPrice = (float) cheapestPrice / 4;

        System.out.printf("Påbörja laddning klockan %02d\n", cheapestStart);
        System.out.printf("Medelpris 4h: %.1f öre/kWh\n", medelCheapestPrice);

    }

}
