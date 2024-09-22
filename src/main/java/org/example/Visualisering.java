package org.example;

import java.util.ArrayList;
import java.util.List;


public class Visualisering {
    public static void visual(Pair[] prices) {
        int vMax = visualMaxMin(prices)[0];
        int vMin = visualMaxMin(prices)[1];

        List<Integer> rows = new ArrayList<>();
        String[][] arr = new String[6][24];
        int height = 6;
        int yStep = (vMax - vMin) / height-1;
        if (yStep == 0) yStep = 1;
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 24; j++) {
                int result = Math.floorDiv(prices[j].pris, yStep);
                if (result >= i) {
                    arr[i][j] = String.format("  x");
                } else {
                    arr[i][j] = String.format("   ");
                }

            }
        }

        String[] fifth = arr[5];
        String[] fourth = arr[4];
        String[] third = arr[3];
        String[] second = arr[2];
        String[] first = arr[1];
        String[] nth = arr[0];
        String q = String.join("", fifth);
        String w = String.join("", fourth);
        String e = String.join("", third);
        String r = String.join("", second);
        String t = String.join("", first);
        String y = String.join("", nth);

        System.out.printf("%d|%s\n", vMax, q);
        System.out.printf("  |%s\n", w);
        System.out.printf("  |%s\n", e);
        System.out.printf("  |%s\n", r);
        System.out.printf("  |%s\n", t);
        System.out.printf("%d|%s\n", vMin, y);
        System.out.print("  |------------------------------------------------------------------------\n");
        System.out.print("  | 00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23\n");
    }

    private static int[] visualMaxMin(Pair[] prices) {
        int minPrice = prices[0].pris;
        int maxPrice = prices[0].pris;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i].pris < minPrice) {
            }
            if (prices[i].pris > maxPrice) {
            }
        }
        int[] visualMaxMin = new int[2];
        visualMaxMin[0] = maxPrice;
        visualMaxMin[1] = minPrice;

        return visualMaxMin;
    }

}
