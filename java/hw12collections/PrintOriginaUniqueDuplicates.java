package hw12collections;

public class PrintOriginaUniqueDuplicates {
    public static void main(String[] args) {
        DuplicatesCollection duplicatesCollection = new DuplicatesCollection(100);

        duplicatesCollection.printOriginalList();
        duplicatesCollection.printUniqueList();
        duplicatesCollection.printDuplicatesCount();
    }
}
