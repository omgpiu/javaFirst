package Basics_SBO;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        double first, second, third, average;

        Scanner input = new Scanner(System.in);
        System.out.println("Input 3 numbers, after each add space");

        first = input.nextDouble();
        second = input.nextDouble();
        third = input.nextDouble();

        average = (first+second+third)/3;

        System.out.println(average);
    }
}
