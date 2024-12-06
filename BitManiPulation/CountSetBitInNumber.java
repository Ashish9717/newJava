package BitManiPulation;

import java.util.Scanner;

public class CountSetBitInNumber {
        public static int Count_SetBit(int num){
             int count  = 0 ; 
             while(num > 0){
                if((num & 1)!= 0){
                    count++;
                }
                num =  num>>1;
             }
             return count;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println(Count_SetBit(num));
                sc.close();
        }
        
}
