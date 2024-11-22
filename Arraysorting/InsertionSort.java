package Arraysorting;

public class InsertionSort {
        public static void Insertion_Sort(int num[]){
                int size = num.length;
                for(int i = 1; i< size ; i++){
                        int current = num[i];
                        int pre = i-1;
                        //Finding out correct position
                        while(pre >= 0 && num[pre] > current){
                                num[pre+1] = num[pre];
                                pre--;
                        }
                        //Insertion
                        num[pre+1] = current;
                }
        }
        public static void Print_Array(int num[]){
             for(int i = 0 ; i<num.length; i++){
                System.out.print(num[i] + " ");
             }
        }
        public static void main(String[] args) {
                int num[] = {5,4,1,3,2};
                Insertion_Sort(num);
                Print_Array(num);
        }
        
}
