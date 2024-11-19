package Array2;

public class SubArraySum {
        public static void SubArray_Sum(int num[]){
                int size = num.length;
                for(int i = 0 ; i< size ; i++){
                        for(int j = i ; j<size ; j++){
                                int SubarraySum = 0;
                                for(int k = i ; k<= j ; k++){  
                                        SubarraySum += num[k];
                                        System.out.print( " " + SubarraySum );   
                                }
                                System.out.println();
                        }
                        System.out.println();
                }
         }
         public static void main(String[] args) {
                int num[] = {2,4,6,8,10};
                SubArray_Sum(num);
         }
        
}
        

