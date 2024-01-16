package hw09shape;

public class GeometricFigures {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(10, "Red"),
                new Rectangle(new double[]{5, 10}, "Blue"),
                new Triangle(new double[]{40, 45, 60}, "Green")
        };

        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println(shape);
            System.out.println("_____");
        }
    }
}
