//package _Functions;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello World from Java!");
        // System.out.println(sum(5, 10));

        // System.out.println(greet("Prince"));
        swap();
        
         

    }
   
    public static int sum(int a, int b) {
        return a + b;
    }

    public static String greet(String msg) {
        System.out.println("This is greet");
        return "Hi " + msg;
    }
    public static void swap(){
        int num1 = 10;
        int num2 = 20;

        int temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println(num1 + " " + num2);
    }
}
