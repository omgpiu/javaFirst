package Basics_SBO;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        double rubbles;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество долларов, для конвертации");
        dollars = input.nextInt();

        rubbles = ROUBLES_PER_DOLLAR * dollars;

        System.out.println("За " + dollars + " вы получите " + (int)(rubbles*100)/100 + " рублей");


    }
}
