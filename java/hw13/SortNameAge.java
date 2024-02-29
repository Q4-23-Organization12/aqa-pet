package hw13;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class SortNameAge {
    public static List<User> sortUsersByNameAndAge(List<User> users) {
        List<User> sortedUsers = new ArrayList<>(users);
        Collections.sort(sortedUsers, Comparator.comparing(user -> user.firstName));
        Collections.sort(sortedUsers, Comparator.comparingInt(user -> user.age));
        return sortedUsers;
    }
}
