package Array2;

public class MaxSubArraySum {

        // Prifix Summ Approach.
        public static void Max_SubArraySum(int num[]){
                int size = num.length;
                int currentSum = 0, maxSum = Integer.MIN_VALUE;
                int prifix[] = new int[size];
                  prifix[0] = num[0]; 
                for(int i = 1 ;i<prifix.length ;i++){
                     prifix[i] = prifix[i-1] + num[i];
                }
                for(int i = 0 ; i< size ; i++){
                        int start = i;
                        for(int j = i ; j<size ; j++){
                                int end = j;
                                currentSum = start==0 ? prifix[end] : prifix[end] - prifix[start-1];
                                System.out.println(currentSum);
                               if(maxSum < currentSum){
                                maxSum = currentSum;
                               }
                        }
                }
                System.out.println("Max Sum : " +maxSum);
                
        }
        public static void main(String[] args) {
                int num[] = {1,-2,6,-1,3};
                Max_SubArraySum(num);
        }
        
}
