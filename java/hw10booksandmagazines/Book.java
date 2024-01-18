package hw10booksandmagazines;

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }

    public static void printBooks(Printable[] printables) {
        System.out.println("Books:");
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
