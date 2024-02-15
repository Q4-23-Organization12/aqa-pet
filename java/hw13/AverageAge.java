package hw13;

import java.util.List;

public class AverageAge {
    public static double calculateAverageAge(List<User> users) {
        return users.stream().mapToInt(user -> user.age).average().orElse(0);
    }
}
