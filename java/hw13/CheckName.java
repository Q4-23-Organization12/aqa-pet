package hw13;

import java.util.List;

public class CheckName {
    public static boolean hasUsersWithSpecificNames(List<User> users) {
        return users.stream().anyMatch(user -> user.firstName.startsWith("S") || user.firstName.startsWith("A"));
    }
}
