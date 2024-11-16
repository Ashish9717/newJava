package Array1;

public class LargestNumber {
        public static int Largest_number(int num[]){
                int size = num.length;
                int max = Integer.MIN_VALUE; // -infinity
                for(int i = 0 ; i< size ; i++){
                        if(max < num[i]){
                                max = num[i];
                        }     
                }
                return max ;
                // return -1;

        }
        public static void main(String[] args) {
                int num[] = {1,2,3,11,2,21,2,3,5};
                System.out.println("Largest Number is : "+Largest_number(num));
        }
        
}
