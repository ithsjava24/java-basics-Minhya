package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Sortera {
    public static void sortedPrice(Pair[] prices) {
        Arrays.sort(prices, Comparator.reverseOrder());

        for (Pair prisIntervall : prices) {
            System.out.printf("""
                    %s öre
                    """, prisIntervall);
        }
    }
}
