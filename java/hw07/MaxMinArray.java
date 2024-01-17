package hw07;
public class MaxMinArray {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 456, 753, 852, 951, 5, 2, 1};

        int maxNumber = findMaxNumber(intArray);
        int minNumber = findMinNumber(intArray);

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
    public static int findMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
    public static int findMinNumber(int[] array) {
        int minNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}

