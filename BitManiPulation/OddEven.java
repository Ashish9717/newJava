package BitManiPulation;

import java.util.Scanner;

public class OddEven {
        public static void Odd_Even(int num){
              int bitMask = 1; 
              if((num & bitMask )== 0){
                System.out.println("Number is Even");
              }else{
                System.out.println("Number is Odd");
              }
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                Odd_Even(num);
                sc.close();
        }
}
