package Basics_SBO;

import java.util.Scanner;

public class ComputeTaxiPrice {
    public static void main(String[] args) {
        double COST_PER_KILOMETERS = 8.50;
        double odometerStart, odometerEnd, distance, totalAmount, afterDot, afterDot2;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите начальные показания одометра");
        odometerStart = input.nextDouble();

        System.out.println("Введите показания одометра после поездки");
        odometerEnd = input.nextDouble();

        distance = odometerEnd - odometerStart;
        totalAmount = distance * COST_PER_KILOMETERS;
        afterDot = (COST_PER_KILOMETERS - (long) COST_PER_KILOMETERS) * 100;
        afterDot2 = (totalAmount - (long) totalAmount) * 100;

        System.out.println("Вы проехали " + totalAmount + " км.");
        System.out.println("Из расчета " + (int) COST_PER_KILOMETERS + " руб. " + (int) afterDot + " коп." + " за км,");
        System.out.println("стоимость проезда равна " + (int) totalAmount + " руб. " + (int) afterDot2 + " коп.");

    }
}
