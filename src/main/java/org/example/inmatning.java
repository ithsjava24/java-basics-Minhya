package org.example;

import java.util.Scanner;

import static org.example.App.inmatat;

public class inmatning {
    //public static float[] askPrices = {4,5,3,7,6,2};
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
