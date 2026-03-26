package LinearSearch;

public class Test {
    public static void main(String[] args) {
        // int[] arr = {8440,87,54,6524,87,8};
        // System.out.println(search(arr,54));
        //String str = "Prince_Muskan";
	   //System.out.println(searchStr(str,'c'));
        int[][] arr = {{10,87,65,87},{21, 54, 8787,87},{11, 12, 14,65}};
	    int target = 14;
	    System.out.println(max2DArray(arr,target));		
    }
    //search target value in array
    static boolean search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }

    //search target value  in String
    static boolean searchStr(String str, char target) {
        
        for (int i = 0; i < str.length(); i++) {
            
            if(target == str.charAt(i)){
                return true;
            }
            
        }
        return false;
    }
    //min in array
    static boolean min(int[] arr,int target){
	    for(int i = 0; i < arr.length; i++){
	        
	        if(target == arr[i]){
	            return true;
	        }
	    }
	    return false;
	}
    //max in range 
    static boolean minRange(int[] arr, int target,int start , int end){
	    for(int i = start + 1; i <= end; i++){
	        
	        if(target == arr[i]){
	            return true;
	        }
	    }
	    return false;
	}
	//max in 2D Array
	static boolean max2DArray(int[][] arr, int target){
	    
	    for(int i = 0; i < arr.length; i++){
	        
	        for(int j = 0; j < arr[i].length; j++){
	            
	            if(arr[i][j] == target){
	                return true;
	            }
	        }
	    }
	    return false;
	}
}
