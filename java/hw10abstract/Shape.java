package hw10abstract;

import java.util.Objects;

public abstract class Shape {

    public abstract String getName();

    private String name;
    private String color;


    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Шаг 4: Абстрактный метод calculateArea() вместо заглушки
    public abstract double calculateArea();

    // Шаг 5: Абстрактный метод calculatePerimeter() вместо заглушки
    public abstract double calculatePerimeter();

    // Шаг 6: Метод paint() без изменений
    public void paint() {
        System.out.println("Color: " + color);
    }

    // Шаг 7: equals и hashCode без изменений
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

    // Шаг 8: toString без изменений
    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}

