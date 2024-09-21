package org.example;

import static org.example.inmatning.askPrices;

public class minmaxmedel {

    public static void minMaxMedel() {

        //inmatning inmatning = new inmatning();


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
