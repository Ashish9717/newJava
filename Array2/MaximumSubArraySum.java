package Array2;

public class MaximumSubArraySum {

        // Brute Force Approach.
        public static void MaxSubArray_Sum(int num[]){
               int maxSum = Integer.MIN_VALUE , currentSum = 0;
               int size = num.length;
               for(int st = 0; st< size; st++){
                int start = st;
                for(int end = st ; end< size; end++){
                        int j = end;
                         currentSum = 0;
                        for(int k = start ; k <= j ; k++ ){
                                currentSum += num[k];
                        }
                        System.out.println(currentSum);
                        if(maxSum < currentSum){
                                maxSum = currentSum;
                        }
                }
               }
               System.out.println("Max Sum :" +maxSum);
        }
        public static void main(String[] args) {
                int num[] = {2,4,6,8,10};
               MaxSubArray_Sum(num);
        }
        
}
