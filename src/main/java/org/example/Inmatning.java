package org.example;

import java.util.Scanner;

public class Inmatning {

    public static Pair[] inputPrices(Scanner in, Pair[] prices) {
        System.out.print("Mata in elpriserna för dygnet i ören per kWh (24 timmar): \n");

        for (int i = 0; i < prices.length; i++) {
            System.out.printf("Pris för timme %02d-%02d: ", i, i + 1);
            String time = String.format("%02d-%02d", i, i + 1);
            prices[i] = new Pair(time, in.nextInt());

        }
        org.example.App.inputVerification = true;
        return prices;


    }
}