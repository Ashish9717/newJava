package Array2;

public class ProductOfArray {
        public static void Product_Array(int num[]){
                int size = num.length;
                int prifix[] = new int[size];
                int suffix[] = new int [size];
                prifix[0] = num[0];
                for(int i = 1 ; i < size; i++){
                        prifix[i] = prifix[i-1] * num[i];

                }
                suffix[size-1] = num[size-1]; 
                for(int  i = size-2 ;i >= 0 ;i++){
                        suffix[i] = suffix[i+1] * num[i];
                }
                int res[] = new int[size];
                for(int i = 1 ; i<= size-1 ; i++){
                        res[i] = prifix[i-1] + suffix[i+1];
                }
                res[0] = suffix[1];
                res[size-1] = suffix[size-2];
                System.out.print(" " + res);
                
                // System.out.print(" " + res);
               
        }
        public static void main(String[] args) {
                int num[] = {1,2,3,4};
                Product_Array(num);
        }
        
}
