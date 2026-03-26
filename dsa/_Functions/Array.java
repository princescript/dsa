import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1]= 20;
        numbers[2]= 30;
        System.out.println(Arrays.toString(numbers));   
               
        int[] nums = new int[]{ 71,28,30,40};
        Arrays.sort(nums);   
          
        for(int i =0 ;i < nums.length ; i++){
            System.out.println(nums[i]);
        }
        for (int i : nums) {
            System.out.println(i);
        }

        int[] totals = {10,20,30,40};
        if(Arrays.equals(totals, nums)){
            System.out.println("true");
        }
    }

}
