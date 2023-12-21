import java.util.Scanner;

public class Task5TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных по Цельсию
        System.out.print("Enter Celsius: ");
        double celsius = scanner.nextDouble();

        // Расчёт по Фаренгейту
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Расчёт по Кельвинам
        double kelvin = celsius + 273.16;

        // Вывод результатов
        System.out.printf("%.2f Celsius: %.2f F; %.2f K%n", celsius, fahrenheit, kelvin);

        scanner.close();
    }
}