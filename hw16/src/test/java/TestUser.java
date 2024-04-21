import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestUser {
    private List<Users> users;

    @BeforeEach
    void setUp() {
        users = new ArrayList<>();
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
    }

    @AfterEach
    void tearDown() {
        users = null;
    }

    @Test
    void sortAge() {
        List<Users> sortedByAge = Main.sortAge(new ArrayList<>(users));
        assertEquals("Noah", sortedByAge.get(0).getFirstName());
        assertEquals("Henry", sortedByAge.get(sortedByAge.size() - 1).getFirstName());
    }

    @Test
    void averageAge() {
        double average = Main.averageAge(new ArrayList<>(users));
        assertEquals(24.6, average);
    }

    @Test
    void sortNameAge() {
        List<Users> sortedByNameAge = Main.sortNameAge(new ArrayList<>(users));
        assertEquals("Michael", sortedByNameAge.get(0).getFirstName());
        assertEquals("Oliver", sortedByNameAge.get(sortedByNameAge.size() - 1).getFirstName());
    }

    @Test
    void usersWithSA() {
        List<Users> usersWithSA = Main.usersWithSA(new ArrayList<>(users));
        assertEquals(4, usersWithSA.size());
    }

    @Test
    @DisplayName("<18")
    void usersYoungerThan18_negative() {
        assertThrows(NullPointerException.class, () -> Main.usersYoungerThan18(null));
    }


}