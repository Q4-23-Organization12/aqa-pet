package hw08;

public class CalculatorCheck {
    public static void main(String[] args) {
        int resultAdd = Calculator.add(5, 3);
        System.out.println("Додавання: " + resultAdd);

        int resultSubtract = Calculator.subtract(8, 4);
        System.out.println("Віднімання: " + resultSubtract);

        int resultMultiply = Calculator.multiply(6, 2);
        System.out.println("Множення: " + resultMultiply);

        double resultDivide = Calculator.divide(9, 3);
        System.out.println("Ділення: " + resultDivide);
    }
}
