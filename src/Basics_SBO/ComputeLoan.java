package Basics_SBO;

import java.awt.*;
import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        final int MONTHS_PER_YEAR = 12;

        double annualInterestRate;
        int numberOfYears;
        double loanAmount;
        double monthlyInterestRate;
        double monthlyPayment;
        double totalPayment;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите годовую ставку");
        annualInterestRate = input.nextDouble();

        System.out.println("Введите срок кредита");
        numberOfYears = input.nextInt();

        System.out.println("Сумма кредита");
        loanAmount = input.nextDouble();

        monthlyInterestRate = annualInterestRate/ MONTHS_PER_YEAR / 100;
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * MONTHS_PER_YEAR));
        totalPayment = monthlyPayment * numberOfYears * MONTHS_PER_YEAR;

        System.out.println("Ежемесячный платеж равен " +
                (int)(monthlyPayment * 100) / 100.0 + " руб.");
        System.out.println("Стоимость кредита равна " +
                (int)(totalPayment * 100) / 100.0 + " руб.");






    }
}
