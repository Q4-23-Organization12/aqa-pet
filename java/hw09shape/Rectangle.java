package hw09shape;

import java.util.Arrays;

public class Rectangle extends Shape {

    private double[] sides;

    public Rectangle(double[] sides, String color) {
        super("Rectangle", color);
        this.sides = Arrays.copyOf(sides, sides.length);
    }

    @Override
    public double calculateArea() {
        return sides[0] * sides[1];
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sides[0] + sides[1]);
    }
}
