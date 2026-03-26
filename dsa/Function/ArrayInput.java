import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Nums");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
         System.out.println(Arrays.toString(nums));
        int[][] matrix = new int[2][2];
        System.out.println("Enter matrix..");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing Matrix..");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
        int[][] table = {
            {10,20},
            {20,40}
        };
        for(int i = 0; i<table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                System.out.println(table[i][j] );
            }
        }
    }
}
