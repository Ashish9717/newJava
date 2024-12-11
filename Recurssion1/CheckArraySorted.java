package Recurssion1;

public class CheckArraySorted {
        public static boolean Check_ArrayIsSorted(int[] nums , int i){
                if(i == nums.length-1){
                        return true;
                }
               if( nums[i] > nums[i+1]){
                     return false;
               }
              return Check_ArrayIsSorted(nums, i+1);
        }
        public static void main(String[] args) {
                int[] nums ={1,2,3,4,5};
                System.out.println(Check_ArrayIsSorted(nums, 0));
        }
        
}
