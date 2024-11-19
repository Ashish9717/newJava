package Array2;

public class PoductOfArray {
        public static void ProductArray_Expectitself(int num[]){
                int size = num.length;
                int res[] = new int[size];
                for(int i = 0 ; i< size ; i++){
                        int product = 1;
                        for(int j = 0 ;j< size ;j++){
                                if(i != j){
                                product = product* num[j];
                                }
                                res[i] = product;
                                System.out.print(" "+res[j]);
                        }
                       System.out.println();
                }

                
        }
        public static void main(String[] args) {
                int num [] = {1,2,3,4};
                ProductArray_Expectitself(num);
                
        }
        
}
