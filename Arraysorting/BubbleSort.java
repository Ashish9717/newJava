package Arraysorting;

public class BubbleSort {
        public static void Bubble_sort(int num[]) {
                int size = num.length -1 ;
                boolean isSwap = false;
                for(int i = 0 ;i< size ; i++){
                         for(int j = 0 ; j <size - i ; j++){
                                if(num[j] > num[j+1]){
                                        int temp = num[j];
                                        num[j] = num[j+1];
                                        num[j+1] = temp;
                                        isSwap = true;
                                }
                         }
                         if(!isSwap){
                                return ;
                         }
                }
        }
        public static void Print_Num(int num[]){
                for(int i = 0 ; i < num.length ;i++){
                        System.out.print(num[i] + " ");
                }
        }
        public static void main(String[] args) {
                int num[] = {3,2,2,3,5,1,5,6,0};
                Bubble_sort(num);
                Print_Num(num);
        }
        
}
