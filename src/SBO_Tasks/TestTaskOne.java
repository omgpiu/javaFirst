package SBO_Tasks;

public class TestTaskOne {
    public static void main(String[] args) {
        Rectangle firstRect = new Rectangle();
//        System.out.println("firstRect"+firstRect);
//        System.out.println("width"+firstRect.width);
//        System.out.println("height"+firstRect.height);
//        System.out.println("area"+firstRect.getArea());
//        System.out.println("perimeter"+firstRect.getPerimeter());

        Rectangle secondRect = new Rectangle(4,40);
//        System.out.println("secondRect"+secondRect);
//        System.out.println("width"+secondRect.width);
//        System.out.println("height"+secondRect.height);
//        System.out.println("area"+secondRect.getArea());
//        System.out.println("perimeter"+secondRect.getPerimeter());

        Rectangle thirdRect = new Rectangle(3.5,35.9);
//        System.out.println("thirdRect"+thirdRect);
//        System.out.println("width"+thirdRect.width);
//        System.out.println("height"+thirdRect.height);
//        System.out.println("area"+thirdRect.getArea());
//        System.out.println("perimeter"+thirdRect.getPerimeter());

        Stock SBER = new Stock("ПАО СБЕРБАНК","RUB",281.50,282.87 );
        System.out.println("SBER"+SBER.getChangePercent());
    }
}
