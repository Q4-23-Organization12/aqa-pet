package hw12collections;

public class AroundFive {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int pivot = 5;
        int leftIndex = 0;
        int rightIndex = list.length - 1;

        while (leftIndex < rightIndex) {

            while (list[rightIndex] > pivot) {
                rightIndex--;
            }

            while (list[leftIndex] <= pivot) {
                leftIndex++;
            }

            if (leftIndex < rightIndex) {
                int temp = list[leftIndex];
                list[leftIndex] = list[rightIndex];
                list[rightIndex] = temp;
            }
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
