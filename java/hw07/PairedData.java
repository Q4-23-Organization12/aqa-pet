package hw07;

import java.util.Scanner;
import java.util.Random;

public class PairedData {
    private static int size;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] intArray = generateRandomArray(size);

        System.out.println("First array:");
        printArray(intArray);

        replaceWithZeros(intArray);

        System.out.println("\nArray with zeros:");
        printArray(intArray);
    }

    public static int[] generateRandomArray(int size) {
        PairedData.size = size;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public static void replaceWithZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

