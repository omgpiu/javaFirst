package Basics_SBO;

import java.util.Scanner;

public class ComputeGeometric {
    public static void main(String[] args) {
        int first;
        int second;
        int third;

        System.out.println("Введите зачение через пробел");
        Scanner input = new Scanner(System.in);


        first = input.nextInt();
        second = input.nextInt();
        third = input.nextInt();

        System.out.println(Math.cbrt(first*second*third));


    }
}
