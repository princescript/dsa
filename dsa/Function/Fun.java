
import java.util.Arrays;

public class Fun {

    public static void main(String[] args) {
        //num("Prince","Singh",10,20,30);
        // int a = 10;
        // {
        //     System.out.println(a);
        //     int b = 30;
        //     System.out.println(b);
        // }
        //Swap(100,20);
        // System.out.println(SwapString("Prince", "Singh"));
        // System.out.println(Add(10,20));
        // VarArgs("Ram","Shyam","Gyan");
        // Add(4, 10);
        // Add(20, 20, 20);
        mutiple(10, 10, 10, 10, 10);
    }

    // public static void num( String a, String b,int ...nums){
    //     System.out.println( a + b + Arrays.toString(nums));
    // }
    // public void Add()
    // {
    //     a = 20;
    //     System.out.println(a);
    // }
    public static int Add(int x, int y) {
        return x + y;
    }

    public static void Add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static String SwapString(String str1, String str2) {
        String temp = str1;
        str1 = str2;
        str2 = temp;
        return str1 + " " + str2;
    }

    public static void VarArgs(String... name) {
        System.out.println(Arrays.toString(name));
    }

    public static void mutiple(int a, int b, int... c) {
        int sum = a + b;
        // for (int i = 0; i < c.length; i++) {
        //     sum += c[i];
        // }
        for (int i : c) {
            sum += i;
        }
        System.out.println(sum);
    }
}
