package hw13;

import java.util.List;

public class CheckAge {
    public static boolean areAllUsersAboveAge(List<User> users, int ageThreshold) {
        return users.stream().allMatch(user -> user.age > ageThreshold);
    }
}
