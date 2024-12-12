package Recurssion2;

public class PrintNumberInReverse {
        public static void Reverse_Number(int n){
                if(n==1){
                        System.out.print(n + " ");
                        return ;
                }
                System.out.print(n +" ");
                Reverse_Number(n-1);
                
        }
        public static void main(String[] args) {
                int n = 10 ;
                Reverse_Number(n);
        }
        
}
