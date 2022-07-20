package SBO_LessonTwo;

import java.util.Random;

public class ShowTIme {


    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        System.out.println(date.getTime());
        System.out.println(date);

        Random firstGenerator = new Random(3);
        for (int i = 0; i < 10; i++)
            System.out.println(firstGenerator.nextInt(1000));
        Random secondGenerator = new Random(3);
        for (int i = 0; 1 < 10; i++)
            System.out.println(secondGenerator.nextInt(1000));

    }

}
