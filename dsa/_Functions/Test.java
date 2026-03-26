

public class Test {

    public static void main(String[] args) {

        System.out.println("Working Program!");
        //System.out.println(IsArmStrong(153));        
    }

    public static boolean IsArmStrong(int num) {
        int sum = 0;
        int org = num;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            sum += rem * rem * rem;
        }
        return org == sum;
    }
}
