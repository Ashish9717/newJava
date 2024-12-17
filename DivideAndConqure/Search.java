package DivideAndConqure;

public class Search {
        public static int Search_Position(int nums[] , int target){
                int left = 0 , right = nums.length-1;
                while (left <= right) {
                     int mid = left + (right - left) /2;
                     if(nums[mid] == target){
                        return mid;
                     }
                     if(nums[left] <= nums[mid]){
                        if(nums[left] <= target && target <= nums[mid]){
                                right = mid;
                        }else{
                                left = mid+1;
                        }

                     }  else{
                        if(target >= nums[mid] && target <= nums[right]){
                                left = mid +1;
                        }else{
                                right = mid -1;
                        }
                     } 
                }
                return -1;
        }
        public static void main(String[] args) {
                int nums[] = {4,5,6,7,8,0,1,2};
                int target = 8;
                System.out.println(Search_Position(nums, target));
        }
        
}
