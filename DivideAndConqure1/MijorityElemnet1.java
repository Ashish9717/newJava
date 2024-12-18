package DivideAndConqure1;

public class MijorityElemnet1 {
        // Optimize code using Modified binary search
        private static int Count(int [] nums , int num , int si , int ei){
                int count  = 0 ;
                for(int i = 0 ; i< nums.length ; i++){
                        if(nums[i] == num){
                                count++;
                        }
                }
                return count;
        }
        
        public static int MijElement(int nums[] ,  int si , int ei){
              // Base condition : When the size of Array is 1
              if(si == ei){
                return nums[si];
              }
              // Recurse the left and right halves of this slice.
              int mid = si + ( ei - si) / 2;
             int left = MijElement(nums, si, mid);
             int right= MijElement(nums, mid+1, ei);
             // If the two halves on the Majority elemnet , return it 
              if(left == right){
                return left;
              }
              // other wise  
              int leftCount = Count(nums, left, si, ei);
              int rightCount = Count(nums, right, si, ei);
              return leftCount > rightCount ? left : right ;

        }
        public static int MajorityElement(int nums[]){
                return MijElement(nums, 0, nums.length -1);
        }
        public static void main(String[] args) {
                int nums[] = {2,2,1,1,1,2,2};
                System.out.println(MajorityElement(nums));
        }
        
}
