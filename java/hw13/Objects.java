package hw13;

import java.util.ArrayList;
import java.util.List;
public class Objects {
    public static List<User> createUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Oliver", "Carter", 23));
        users.add(new User("William", "Anderson", 30));
        users.add(new User("Elijah", "Moore", 19));
        users.add(new User("Noah", "Martin", 25));
        users.add(new User("Benjamin", "Garcia", 40));
        users.add(new User("Lucas", "Mitchell", 17));
        users.add(new User("Henry", "Thompson", 35));
        users.add(new User("Alexander", "Baker", 21));
        users.add(new User("Michael", "Lewis", 27));
        users.add(new User("Daniel", "Robinson", 50));
        return users;
    }
}
