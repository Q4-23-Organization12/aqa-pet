package hw10booksandmagazines;

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }

    public static void printMagazines(Printable[] printables) {
        System.out.println("Magazines:");
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
