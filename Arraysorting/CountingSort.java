package Arraysorting;

public class CountingSort {
        public static void Counting_sort(int num[]){
                int n = num.length;
                int largest = Integer.MIN_VALUE;
                for(int i = 0 ; i < n ; i++){
                        largest = Math.max(largest , num[i]);
                }
               int count[] = new int[largest +1];
               for(int i = 0 ; i < n; i++){
                     count[num[i]]++;
               } 
               int j = 0 ;
                for(int i = 0 ; i < count.length; i++){
                        while(count[i] > 0){
                                num[j] = i;
                                j++;
                                count[i]--;
                        }
                }
        }
        public static void PrintArr(int num[]){
                for(int i = 0 ; i< num.length; i++){
                        System.out.print(num[i] + " ");
                }
        }
        public static void main(String[] args) {
                int num [] = {1,2,3,4,5,0,1,0,3,0,2,0,1};
                Counting_sort(num);
                PrintArr(num);
        }
}
