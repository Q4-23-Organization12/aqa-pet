package hw06;

public class MiddleTwoChars {
    public static void main(String[] args) {
        String[] strings = {
                "MercedesBenz",
                "Ford",
                "Volkswagen",
                "Toyota",
                "Alfa Romeo"
        };

        for (String str : strings) {
            String result = getMiddleTwoChars(str);
            System.out.println("For String \"" + str + "\" result: " + result);
        }
    }

    public static String getMiddleTwoChars(String str) {
        int length = str.length();

        if (length % 2 == 0 && length >= 2) {

            int middle1 = length / 2 - 1;
            int middle2 = length / 2;

            return str.substring(middle1, middle2 + 1);
        } else {

            return "Incorrect Data";
        }
    }
}
