package hw09shape;

import java.util.Objects;

public class Shape {


    private String name;
    private String color;
    private Object objects;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

    public void paint() {
        System.out.println("Color: " + color);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Shape shape = (Shape) obj;
        return name.equals(shape.name) && color.equals(shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
   }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

