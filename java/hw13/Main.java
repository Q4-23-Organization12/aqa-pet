package hw13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Objects.createUsers();

        List<User> sortedByAgeUsers = SortAge.sortUsersByAge(users);
        System.out.println("Сортировка по возрасту: " + sortedByAgeUsers);

        double averageAge = AverageAge.calculateAverageAge(users);
        System.out.println("Средний возраст пользователей: " + averageAge);

        List<User> sortedByNameAndAgeUsers = SortNameAge.sortUsersByNameAndAge(users);
        System.out.println("Сортировка по имени и возрасту: " + sortedByNameAndAgeUsers);

        boolean hasSpecificNames = CheckName.hasUsersWithSpecificNames(users);
        System.out.println("Есть ли пользователи с именем, начинающимся на 'S' или 'А': " + hasSpecificNames);

        boolean allUsersAbove18 = CheckAge.areAllUsersAboveAge(users, 18);
        System.out.println("Все ли пользователи старше 18 лет: " + allUsersAbove18);
    }
}
