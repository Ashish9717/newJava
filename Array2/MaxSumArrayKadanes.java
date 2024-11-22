package Array2;

public class MaxSumArrayKadanes {

        // Calculate maximum sum of Subarray using kadanes algorithm.
        public static void Maximum_SumOfSubArray(int num[]){
                int size = num.length;
                int currentSum = 0 , maxSum = Integer.MIN_VALUE;

                for(int i = 0 ; i< size ; i++){
                        currentSum += num[i];
                        maxSum = Math.max(currentSum , maxSum);
                        if(currentSum < 0){
                                currentSum = 0;
                        }
                        // maxSum = Math.max(currentSum , maxSum);
                }
                System.out.println("Max Sum : "+maxSum);
        }
        public static void main(String[] args) {
                int num[] = {-1};
                Maximum_SumOfSubArray(num);
        }
        
}
