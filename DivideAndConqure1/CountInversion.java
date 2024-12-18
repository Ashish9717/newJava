package DivideAndConqure1;

public class CountInversion {
        public static int Count_Inversion(int[] nums , int si ,int ei ){
                //Optimize code using Merge sort
                int countInversion = 0;
                if(ei > si){
                        int mid = si + (ei - si) / 2;
                      countInversion=  Count_Inversion(nums, si, mid);
                       countInversion += Count_Inversion(nums, mid+1, ei); 
                       countInversion += Count(nums, si, mid+1, ei);     
                }
                return countInversion;
              
        }
        public static int Count(int nums[] , int si , int mid , int ei){
           
                int i = si , j = mid, k = 0;
                int count = 0 ;
                int temp[] = new int[ei - si +1];
                while(i <= mid && j <= ei){
                        if(nums[i] < nums[j]){
                                temp[k] = nums[i];
                                
                                i++; k++;
                        }else{
                                temp[k] = nums[j];
                                count += (mid - i);
                                k++;j++;
                        }
                }
                while(i < mid){
                        temp[k++] = nums[i++];
                }
                while (j <= ei) {
                        temp[k++] = nums[j++];
                }
                for(k= 0 , i= si ; k < temp.length; k++ , i++){
                        nums[i] = temp[k];
                }
                return count ;

        }
        public static int GetInversion(int nums[]){
                int n = nums.length;
                return Count_Inversion(nums, 0, n-1);
        }
        public static void main(String[] args) {
                int nums[] = {9,7,5,3};
                System.out.println(GetInversion(nums));
        }

        
}
