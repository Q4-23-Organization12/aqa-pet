package hw07;

public class SinArray {
    public static void main(String[] args) {
        int size = 37;

        double[] sinValues = new double[size];

        for (int i = 0, x = 0; i < size; i++, x += 10) {
            double radians = Math.toRadians(x);
            sinValues[i] = Math.sin(radians);
        }

        printArray(sinValues);
    }

    public static void printArray(double[] array) {
        System.out.println("The value of sin(x) from 0 to 360 in steps of 10:");

        for (int i = 0, x = 0; i < array.length; i++, x += 10) {
            System.out.println("sin(" + x + "): " + array[i]);
        }
    }
}