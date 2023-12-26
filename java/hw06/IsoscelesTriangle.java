package hw06;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side AB: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter side BC: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter side CA: ");
        int number3 = scanner.nextInt();

        if ((number1 == number2 && number1 != number3) || (number1 == number3 && number3 != number2) || (number2 == number3 && number2 != number1)) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Triangle Not Isosceles");

            scanner.close();
        }
    }
}
