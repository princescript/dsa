public class Array{
    public static void main(String[] args) {
        int[] arr = {8440,87,54,6524,87,8};
        System.out.println(minValueRange(arr, 1, 4));
        System.out.println("Running latest Array.java");
        
		//System.out.println(reverse(arr));
		//System.out.println(Arrays.toString(arr));
    }
    //reverse an array
    static int reverse(int[] arr)
	{
	    int start = 0;
	    int end = arr.length -1;
	    while(start < end)
        {
        swap(arr,start,end);
        start++;
        end--;
        }
        return 1;
	}
    //swap an array on basis index
	static void swap(int[] arr, int left, int right)
	{
	    int temp = arr[left];
	    arr[left] = arr[right];
	    arr[right] = temp;
	}
    //max value of an Array in Range
    static int maxValueRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    //min value of an Array in Range
    static int minValueRange(int[] arr, int start, int end) {
        int min = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    //find max in array
    static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
