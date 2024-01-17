package hw09shape;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
