
public class PrimeNumber {

    public static void main(String[] arges) {
        //Write a program to determine if a number is prime.
        int num = 20;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
