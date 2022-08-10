package Basics_SBO;

import java.util.Scanner;

public class ComputeExchange {
    public static void main(String[] args) {
        int numberOf5000Roubles; // количество 5 тыс. руб. купюр
        int numberOf2000Roubles; // количество 2 тыс. руб. купюр
        int numberOf1000Roubles; // количество 1 тыс. руб. купюр
        int numberOf500Roubles; // количество 500 руб. купюр
        int numberOf200Roubles; // количество 200 руб. купюр
        int numberOf100Roubles; // количество 100 руб. купюр
        int numberOf50Roubles; // количество 50 руб. купюр

        int amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму");
        amount = input.nextInt();
        numberOf5000Roubles = amount/5000;
        System.out.println("    " + amount + "");
        amount %=5000;
        System.out.println("    " + amount + "");
        numberOf2000Roubles = amount/2000;
        System.out.println("  numberOf2000Roubles  " + numberOf2000Roubles + "");
        amount %=2000;
        System.out.println("    " + amount + "");
        numberOf1000Roubles = amount/1000;
        amount %=1000;
        System.out.println("    " + amount + "");
        numberOf500Roubles = amount/500;
        amount %=500;
        System.out.println("    " + amount + "");
        numberOf200Roubles = amount/200;
        amount %=200;
        System.out.println("    " + amount + "");
        numberOf100Roubles = amount/100;
        amount %=100;
        System.out.println("    " + amount + "");
        numberOf50Roubles = amount/50;

        System.out.println("Ваша сумма состоит из");
        System.out.println("    " + numberOf5000Roubles + " шт. 5-тыс. руб. купюр,");
        System.out.println("    " + numberOf2000Roubles + " шт. 2-тыс. руб. купюр,");
        System.out.println("    " + numberOf1000Roubles + " шт. 1-тыс. руб. купюр,");
        System.out.println("    " + numberOf500Roubles + " шт. 500-руб. купюр,");
        System.out.println("    " + numberOf200Roubles + " шт. 200-руб. купюр,");
        System.out.println("    " + numberOf100Roubles + " шт. 100-руб. купюр,");
        System.out.println("    " + numberOf50Roubles + " шт. 50-руб. купюр.");
    }
}
