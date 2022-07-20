package Basics_SBO;

public class ShowLogicError {
    public static void main(String[] args) {
        //не правильно
        System.out.println((9/5)*35+32);
        // правильно
        System.out.println((9.0/5)*35+32);
    }
}
