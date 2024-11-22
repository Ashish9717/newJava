package Arraysorting;

public class SelectionSort {
        public static void Selection_sort(int num[]){
                int size = num.length;
                for(int i = 0 ; i< size-1 ; i++){
                        int minPos = i;
                        for(int j = i+1 ; j< size ; j++){
                                if(num[j] < num[minPos]){
                                        minPos = j;
                                }
                        }
                        //swap
                        int temp = num[minPos];
                        num[minPos] = num[i];
                        num[i] = temp; 
                }
        }
        public static void Print_SortedArray(int num[]){
                for(int i = 0 ; i < num.length; i++){
                        System.out.print(num[i] + " ");
                }
        }
        public static void main(String[] args) {
                int num [] = {1,2,3,1,4,0,1,0,3,5,6,0};
                Selection_sort(num);
                Print_SortedArray(num);
        }
        
}
