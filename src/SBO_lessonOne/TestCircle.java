package SBO_lessonOne;

public class TestCircle {
    public static void main(String[] args) {
        Circle initCircle = new Circle();
        System.out.println("initCircle"+initCircle.radius);

        Circle secondCircle = new Circle(25);
        System.out.println("secondCircle"+secondCircle.radius);

        secondCircle.setRadius(200);
        System.out.println("secondCircle change"+secondCircle.radius);

    }
}
