import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Users> users = new ArrayList<>();
        users.add(new Users("Oliver", "Carter", 23));
        users.add(new Users("William", "Anderson", 30));
        users.add(new Users("Elijah", "Moore", 19));
        users.add(new Users("Noah", "Martin", 25));
        users.add(new Users("Benjamin", "Garcia", 40));
        users.add(new Users("Lucas", "Mitchell", 17));
        users.add(new Users("Henry", "Thompson", 35));
        users.add(new Users("Alexander", "Baker", 21));
        users.add(new Users("Michael", "Lewis", 27));
        users.add(new Users("Daniel", "Robinson", 50));

        sortAge(users);
        averageAge(users);
        sortNameAge(users);
        usersWithSA(users);
        usersYoungerThan18(users);
    }

    public static List<Users> sortAge(List<Users> users) {
        List<Users> sortedByAge = users.stream()
                .sorted(Comparator.comparingInt(Users::getAge))
                .collect(Collectors.toList());
        System.out.println("Сортування за віком:");
        System.out.println(sortedByAge);
        return sortedByAge;
    }

    public static double averageAge(List<Users> users) {
        double averageAge = users.stream()
                .mapToInt(Users::getAge)
                .average()
                .orElse(0);
        System.out.println("Середній вік:" + averageAge);
        return averageAge;
    }

    public static List<Users> sortNameAge(List<Users> users) {
        List<Users> sortedByNameAndAge = users.stream()
                .sorted(Comparator.comparing(Users::getFirstName).thenComparing(Users::getAge))
                .collect(Collectors.toList());
        System.out.println("Сортування Ім'я та вік:");
        System.out.println(sortedByNameAndAge);
        return sortedByNameAndAge;
    }

    public static List<Users> usersWithSA(List<Users> users) {
        List<Users> usersWithSA = users.stream()
                .filter(user -> user.getFirstName().startsWith("S") || user.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
        if (!usersWithSA.isEmpty()) {
            System.out.println("Користувачі з літерами S та A:");
            System.out.println(usersWithSA);
        } else {
            System.out.println("Немає користувачів з літерами S та A");
        }
        return usersWithSA;
    }

    public static List<Users> usersYoungerThan18(List<Users> users) {
        List<Users> usersYoungerThan18 = users.stream()
                .filter(user -> user.getAge() < 18)
                .collect(Collectors.toList());
        if (!usersYoungerThan18.isEmpty()) {
            System.out.println("Користувачі молодше 18 років:");
            System.out.println(usersYoungerThan18);
        } else {
            System.out.println("Усі користувачі старше або дорівнюють 18 рокам");
            return Collections.emptyList();
        }
        return usersYoungerThan18;
    }
}