package hw06;
import  java.util.Scanner;
/*import - ключевое слово в Java для импорта пакетов или классов из других файлов
java.util.Scanner - класс, предоставляющий удобные методы для считывания данных ввода, таких как числа или строки,
из различных источников */
public class CheckOddEven {
    /*public class CheckOddEven: Объявление класса с именем CheckOddEven. В Java каждая программа начинается с
    определения класса*/
    public static void main(String[] args) {
        /* public static void main(String[] args) - главный метод (точка входа) программы. Всегда начинается выполнение
        программы с этой точки.*/
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода
/*Scanner scanner = new Scanner(System.in): - создание объекта класса Scanner с именем scanner для считывания
данных с клавиатуры*/
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
