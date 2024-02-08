package hw12collections;

import java.util.*;

public class DuplicatesCollection {


    private List<Integer> originalList;
    private List<Integer> uniqueList;
    private int duplicatesCount;

    public DuplicatesCollection(int size) {
        Random random = new Random();
        originalList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            originalList.add(random.nextInt(41) - 20);
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueList = new ArrayList<>();

        for (Integer num : originalList) {
            if (uniqueNumbers.add(num)) {
                uniqueList.add(num);
            }
        }

        duplicatesCount = originalList.size() - uniqueList.size();
    }

    public void printOriginalList() {
        System.out.println("Начальная коллекция:");
        System.out.println(originalList);
    }

    public void printUniqueList() {
        System.out.println("\nКоллекция после удаления дублей:");
        System.out.println(uniqueList);
    }

    public void printDuplicatesCount() {
        System.out.println("\nКоличество удаленных дублей: " + duplicatesCount);
    }
}
