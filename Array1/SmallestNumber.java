package Array1;

public class SmallestNumber {
        public static int Smallest_Number(int num[]){
                int size = num.length;
                int min = Integer.MAX_VALUE;
                for(int i = 0 ; i< size ; i++){
                        if(min > num[i]){
                                min = num[i];
                        }
                }
                return min;
        }
        public static void main(String[] args) {
                int num[] = {1,2,3,22,44,5,4,5,2,6,0,2,2,3,-1,4,51};

                System.out.println("Smallest number is : " + Smallest_Number(num));
        }
        
}
