
public class Palindrome {

    public static void main(String[] args) {
        // Write a program to check if a number is a palindrome.
        int num = 1341;
        int org = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        if (org == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }
    }
}
