package DivideAndConqure1;

public class CountNumberOfInversion {
        public static int Count_Iniversion(int[] nums ){
                int count = 0;
                for(int i = 0 ; i< nums.length - 1; i++){
                    for(int j = i+1 ; j< nums.length; j++){
                        if(nums[i] > nums[j]){
                                count++;
                        }
                    }
                }
                return count;
        }
        public static void main(String[] args) {
                int nums[] = {9,7,5,3  };
                System.out.println(Count_Iniversion(nums));
        }
        
}