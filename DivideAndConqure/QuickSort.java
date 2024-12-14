package DivideAndConqure;

public class QuickSort {

        public static void Quick_Sort(int []  nums , int si , int ei){

                if(si >= ei){
                        return ;
                }
                //last element 

                int pivot = Partition(nums, si, ei);

                Quick_Sort(nums, si, pivot-1); // left
                Quick_Sort(nums, pivot+1, ei);// Right
                
                
        }
        public static int Partition(int nums[] , int si , int ei){
                int pivot = nums[ei];
                int i = si -1;// To make place for smaller elemnet then pivot 

                for(int j = si ; j < ei ; j++){
                        if(nums[j] <= pivot){
                                i++;
                                // Swap
                                int temp = nums[j];
                                nums[j] = nums[i];
                                nums[i]  = temp;
                        }
                }
                i++;
                                // Swap
                                int temp = pivot;
                                nums[ei] = nums[i]; //
                                nums[i]  = temp;
                                return i;
        }
        public static void PrintArr(int nums[]){
                for(int i = 0 ; i< nums.length ;i++){
                        System.out.print(nums[i] +" ");
                }
        }
        public static void main(String[] args) {
                int nums[] = {2,4,5,2,4,9,7,1,7,0};
                Quick_Sort(nums, 0,nums.length-1);
                PrintArr(nums);
        }
        
}
