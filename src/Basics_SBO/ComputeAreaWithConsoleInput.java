package Basics_SBO;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        double radius; // радиус круга
        double area; // площадь круга

        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        // Получить (от пользователя) радиус круга
        System.out.print("Введите радиус круга: ");
        radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Некорректные входные данные.");
        } else {
            area = 3.14159 * radius * radius;
            System.out.println("Площадь круга для радиуса " +
                    radius + " равна " + area + ".");
        }

    }
}