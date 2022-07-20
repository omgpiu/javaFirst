package Basics_SBO;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius;
        double area;

        Scanner input = new Scanner(System.in);

        // Запрос радиус круга
        System.out.println("Введите радиус круга:");
        radius = input.nextDouble();

        //Вычисление площади круга
        area = PI*radius*radius;

        System.out.println(area);
    }
}
