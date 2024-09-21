package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Sortera {
    public static void sortedPrice(Pair[] prices) {
        Arrays.sort(prices, Comparator.reverseOrder());
        Pair[] sortedPrice = prices;

        for (Pair prisIntervall : sortedPrice) {
            System.out.printf("""
                    %s öre
                    """, prisIntervall);
        }
    }
   }
