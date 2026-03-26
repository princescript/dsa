
class Test2 {

    public static void main(String[] args) {
        System.out.println("Working Program");
        System.out.println(isPalindrom(1255));
    }

    static boolean isPalindrom(int num) {
        int org = num;
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            res = res * 10 + rem;
        }
        return org == res;
    }
}
