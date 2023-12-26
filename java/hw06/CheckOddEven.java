package hw06;
import  java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода
        System.out.print("Enter a number: "); // Печатаем текст с подсказкой
        int number = scanner.nextInt(); // Анализ числа
        /*int number = scanner.nextInt(): Считывание значение кот ввели с клавиатуры и сохранение его в переменной
        number.*/

        if (number % 2 == 0) {
            System.out.println("Even number"); // Если число четное, печатаем "Even number"
        } else {
            System.out.println("Odd number"); // Если число дробное, печатаем "Odd number"
        }

        System.out.println("BYE"); // Печатаем "BYE" перед завершением программы
        scanner.close();
    }
}
