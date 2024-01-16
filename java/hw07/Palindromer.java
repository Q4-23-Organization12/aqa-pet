package hw07;

import java.util.Scanner;
public class Palindromer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("palindrome");
        } else {
            System.out.println("no palindrome");
        }
    }
    public static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();

        int a = 0;
        int b = charArray.length - 1;

        while (a < b) {
            if (charArray[a] != charArray[b]) {
                return false;
            }
            a++;
            b--;
        }

        return true;
    }
}
