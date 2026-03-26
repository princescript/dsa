//Write a program to generate the Fibonacci series up to a given number.

public class FibonacciSeries {

    public static void main(String[] args) {

        int num = 20;
        int a = 0;
        int b = 1;
        while (a <= num) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }

    }
}
