package Array2;

public class MaxSumArrayKadanes {

        // Calculate maximum sum of Subarray using kadanes algorithm.
        public static void Maximum_SumOfSubArray(int num[]){
                int size = num.length;
                int currentSum = 0 , maxSum = Integer.MIN_VALUE;

                for(int i = 0 ; i< size ; i++){
                        currentSum += num[i];
                        if(currentSum < 0){
                                currentSum = 0;
                        }
                        if(currentSum > maxSum){
                                maxSum = currentSum ;
                }
                }
                System.out.println("Max Sum : "+maxSum);
        }
        public static void main(String[] args) {
                int num[] = {-2,-3,4,-1,-2,1,5,-3};
                Maximum_SumOfSubArray(num);
        }
        
}
