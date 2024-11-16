package Array1;

public class PairsinArray {
        public static void Pairs_of_Array(int num[]){
                int size = num.length;
                int tp = 0;
                for(int i = 0 ; i< size ; i++){
                        int current = num[i];
                        for(int j = i+1 ; j< size ; j++){
                                System.out.print("(" + current +"," + num[j]  +")"); 
                                tp++;
                        }
                        System.out.println();
                }
                System.out.println("Total pairs : " + tp);
        }
        public static void main(String[] args) {
                int num[] = {2, 4, 5 ,6,7,8};
                Pairs_of_Array(num);
        }
        
}
