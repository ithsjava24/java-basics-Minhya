package org.example;

import java.util.Arrays;

import static org.example.inmatning.askPrices;

public class sortera {
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