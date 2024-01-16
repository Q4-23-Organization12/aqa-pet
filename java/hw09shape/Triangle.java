package hw09shape;

import java.util.Arrays;

public class Triangle extends Shape {
    private double[] sides;

    // Конструктор
    public Triangle(double[] sides, String color) {
        super("Triangle", color);
        this.sides = Arrays.copyOf(sides, sides.length);
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }

    @Override
    public double calculatePerimeter() {
        return sides[0] + sides[1] + sides[2];
    }
}
