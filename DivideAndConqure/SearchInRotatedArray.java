package DivideAndConqure;

public class SearchInRotatedArray {
        public static int Search_In_RotatedArray(int nums[] , int target , int si , int ei){
                if(si > ei){
                        return -1;
                }
                // Modified Binary Search
               int mid = si + (ei - si) / 2;

               // Case Found
               if(nums[mid] == target){
                return mid;
               }
               //When array contains Duplicate elements 
               if(nums[si] == nums[mid] && nums[ei] == nums[mid]){
                     si++;
                     ei--;
               }
                // mid lie on line 1
                if(nums[si] <= nums[mid]){
                        //case a : left
                        if(nums[si] <= target && target <= nums[mid]){
                             return Search_In_RotatedArray(nums, target, si, mid);
                        }else{
                             // case b : right
                             return Search_In_RotatedArray(nums, target, mid+1, ei);
                        }

                }
                // lie on Line 2
                else{
                     if(target >= nums[mid] && target <= nums[ei]){
                        return Search_In_RotatedArray(nums, target, mid+1, ei);
                     }else{
                        return Search_In_RotatedArray(nums, target, si, mid-1);
                     }
                }

        }
        public static void main(String[] args) {
                int nums[] = {2,5,6,0,0,1,2};
                int target = 3;
                System.out.println(Search_In_RotatedArray(nums, target, 0, nums.length-1));
        }
        
}
