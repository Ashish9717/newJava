package Recurssion3;

public class FindAllOccurence {
        public static void Find_Occurence(int nums[] , int key , int i){
                // Base case 
                if(i == nums.length){
                         return ;
                }
                // Print Occurence
                if(nums[i] == key){
                        System.out.print(i + " " );
                }
                Find_Occurence(nums, key, i+1);
        }
        public static void main(String[] args) {
                int nums[] ={3,2,4,5,6,2,7,2,2};
                int key = 2;
                Find_Occurence(nums, key, 0);
        }
        
}
