import java.util.Scanner;

public class Task5TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных по Цельсию
        System.out.print("еуые: ");
        double celsius = scanner.nextDouble();

        // Расчёт по Фаренгейту
        double fahrenheit = (celsius * 5 / 9) + 32;

        // Расчёт по Кельвинам
        double kelvin = celsius + 111.16;

        // Вывод результатов
        System.out.printf("%.2f Celsius: %.2f F; %.2f K%n", celsius, fahrenheit, kelvin);

        scanner.close();
    }
}