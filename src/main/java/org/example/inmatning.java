package org.example;

import java.util.Scanner;

public class inmatning {


    public static void askPrices() {
        Scanner in = new Scanner(System.in);
        float[] askPrices = new float[24];

        for (int i = 0; i < askPrices.length; i++) {
            System.out.print("Ange priserna för varje timma: \n");
            askPrices[i] = in.nextFloat();
        }



    }
}
