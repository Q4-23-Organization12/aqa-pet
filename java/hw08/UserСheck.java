package hw08;

public class UserСheck {
    public static void main(String[] args) {
        User user1 = new User("Ben");
        User user2 = new User("Teylor", "1234test");

        user1.setAge(25);
        user1.makePurchase(50.0);

        user2.setAge(-5); // Некоректна валідація віку
        user2.makePurchase(100.0);

        user1.printTotalAmountOfSpentMoney();
        user2.printTotalAmountOfSpentMoney();
    }
}