package Pattern2;

import java.util.*;
public class ZeroOne {
        public static void main(String[] args) {
                Scanner sc = new Scanner( System.in);

                int line = sc.nextInt();
                for(int i = 1 ; i<= line ; i++){
                        for(int j =1 ; j<=i ; j++){
                                if(i % 2 == 0 && j % 2 !=0){
                                        System.out.print(0);
                                }else{
                                        System.out.print(1);
                                }
                        }
                        System.out.println();
                }
                sc.close();
        }
        
}