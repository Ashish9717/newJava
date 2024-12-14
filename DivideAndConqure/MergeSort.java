package DivideAndConqure;

public class MergeSort {
           
        public static void Merge_Sort(int[] nums , int si , int ei){
              if(si >= ei){
                return;
              }
              // Kaam
                int mid  = si +(ei - si) /2;
                Merge_Sort(nums, si, mid); // Left part
                Merge_Sort(nums, mid+1, ei); // Right part
                merge(nums, si, mid, ei);
        }
        public static void merge(int nums[] , int si , int mid , int ei){
                   
                int temp[] = new int[ei-si+1];
                int i = si ; //left
                int j = mid +1;// right
                int k = 0 ; // temparr
                while(i <= mid && j<= ei){
                        if(nums[i] < nums[j]){
                                temp[k] = nums[i];
                                i++;
                        }else{
                                temp[k] = nums[j];
                                 j++;
                        }
                        k++;
                }
                // left part
                while(i <= mid){
                        temp[k++] = nums[i++];
                }
                // right
                while(j <= ei){
                        temp[k++] = nums[j++];
                }
                //copy temp to original array
                for( k = 0 ,i = si ; k<temp.length ;k++ ,i++){
                        nums[i] = temp[k];
                }
                
        }

        public static void PrintArr(int nums[]){
                for(int i= 0; i< nums.length ; i++ ){
                        System.out.print(nums[i] +" ");
                }
                System.out.println();
        }

        public static void main(String[] args) {
                int nums[] ={10,6,8,5 ,7,9,0,0,2,3,4,2,3,1};
                Merge_Sort(nums, 0, nums.length-1);
                PrintArr(nums);

        }
        
}
