package hw10booksandmagazines;

class PrintableCollection {
    public static void main(String[] args) {

        Printable[] printables = {
                new Book("A Practitioner's Guide to Software Test Design"),
                new Book("How does Google test?"),
                new Book("Clean code"),
                new Magazine("Octopus"),
                new Magazine("National Geographic"),
                new Magazine("Vogue")
        };

        System.out.println("Printing all items:");
        for (Printable printable : printables) {
            printable.print();
        }

        Book.printBooks(printables);

        Magazine.printMagazines(printables);
    }
}