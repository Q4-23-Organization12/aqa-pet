package hw13;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class SortAge {
    public static List<User> sortUsersByAge(List<User> users) {
        List<User> sortedUsers = new ArrayList<>(users);
        Collections.sort(sortedUsers, Comparator.comparingInt(user -> user.age));
        return sortedUsers;
    }
}
