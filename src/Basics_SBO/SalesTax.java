package Basics_SBO;

import java.util.Locale;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        double purchaseAmount, tax;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        // Получить стоимость покупки в рублях
        System.out.print("Введите стоимость покупки в рублях: ");
        purchaseAmount = input.nextDouble();

        // Вычислить НДС в рублях
        tax = purchaseAmount * 0.2;

        // Отобразить НДС в рублях
        System.out.println("НДС равен " + (int)(tax * 100) / 100.0 + " руб.");
    }
}
