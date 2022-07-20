package Basics_SBO;

import java.util.Scanner;

public class ComputeLength {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius;
        double length;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус круга:");

        radius = input.nextDouble();
        length = 2*PI*radius;
        System.out.println("Длина круга равна: "+ length);
    }
}
