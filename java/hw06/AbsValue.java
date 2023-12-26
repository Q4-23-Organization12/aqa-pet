package hw06;

import java.util.Scanner;
public class AbsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Value: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second Value: ");
        int number2 = scanner.nextInt();

        int absValue1 = Math.abs(number1);
        int absValue2 = Math.abs(number2);

        if (absValue1 > absValue2) {
            System.out.println("Value " + number1 + " > Value " + number2 );
        } else if (absValue1 < absValue2) {
            System.out.println("Value " + number1 + " < Value " + number2);
        } else {
            System.out.println("Absolute Values " + number1 + " And " + number2 + " Equal Values ");

            scanner.close();
        }
    }
}


