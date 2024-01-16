package hw09calculators;

import java.util.Scanner;

public class DataCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a calculator (1 - Engineering, 2 - Programmable):");
        int choice = scanner.nextInt();

        Calculator calculator;

        if (choice == 1) {
            calculator = new EngineeringCalculator();
        } else if (choice == 2) {
            calculator = new ProgrammableCalculator();
        } else {
            System.out.println("Invalid choice. Engineering calculator selected by default.");
            calculator = new EngineeringCalculator();
        }

        performCalculation(calculator);

        scanner.close();
    }

    static void performCalculation(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double x = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double y = scanner.nextDouble();

        // Perform basic operations
        System.out.println("Addition: " + calculator.add(x, y));
        System.out.println("Subtraction: " + calculator.subtract(x, y));
        System.out.println("Multiplication: " + calculator.multiply(x, y));
        System.out.println("Division: " + calculator.divide(x, y));

        // Check if the calculator is an EngineeringCalculator
        if (calculator instanceof EngineeringCalculator) {
            // Perform additional operation for EngineeringCalculator: Division by 100
            EngineeringCalculator engCalculator = (EngineeringCalculator) calculator;
            System.out.println("Division by 100: " + engCalculator.dividebyonehundred(x, y));
        }

        // Check if the calculator is a ProgrammableCalculator
        if (calculator instanceof ProgrammableCalculator) {
            // Perform additional operation for ProgrammableCalculator: Multiplication by 100
            ProgrammableCalculator progCalculator = (ProgrammableCalculator) calculator;
            System.out.println("Multiplication by 100: " + progCalculator.multiplybyonehundred(x, y));
        }

        scanner.close();
    }
}