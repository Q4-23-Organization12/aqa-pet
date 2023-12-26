package hw06;
import java.util.Scanner;
public class MonthSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-12): ");
        int month = scanner.nextInt();
        // Проверяем, является ли введенное значение допустимым месяцем (от 1 до 12)
        if (month >= 1 && month <= 12) {
            // Используем конструкцию switch для определения аббревиатуры месяца
            switch (month) {
                case 1:
                    System.out.println("JAN");
                    break;
                case 2:
                    System.out.println("FEB");
                    break;
                case 3:
                    System.out.println("MAR");
                    break;
                case 4:
                    System.out.println("APR");
                    break;
                case 5:
                    System.out.println("MAY");
                    break;
                case 6:
                    System.out.println("JUN");
                    break;
                case 7:
                    System.out.println("JUL");
                    break;
                case 8:
                    System.out.println("AUG");
                    break;
                case 9:
                    System.out.println("SEP");
                    break;
                case 10:
                    System.out.println("OCT");
                    break;
                case 11:
                    System.out.println("NOV");
                    break;
                case 12:
                    System.out.println("DEC");
                    break;
            }
        } else {
            // Если введенное значение не является допустимым месяцем, выводим сообщение об ошибке
            System.out.println("Not a valid month");
        }
        scanner.close();
    }
}