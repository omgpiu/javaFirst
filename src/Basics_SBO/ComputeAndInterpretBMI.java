package Basics_SBO;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100;
        double weight;
        double height;
        double bmi;
        double heightMeters;
        double heightСentimeters;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите свой вес");
        weight = input.nextDouble();

        System.out.println("Введите свой рост в метрах");
        heightMeters = input.nextDouble();

        System.out.println("Введите свой рост в сантиметрах");
        heightСentimeters = input.nextDouble();

        height = heightMeters + heightСentimeters/100;

        bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");
    }

}

