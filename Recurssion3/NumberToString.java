package Recurssion3;

public class NumberToString {
        static String digits[] = {"zero","one","two" , "three" , "four" ,"five","six","seven","eight","nine"};
        public static void Number_String(int n){
                // Base condition
                if(n == 0){
                        return ;
                }
                int Lastdigit = n % 10;
                Number_String(n/10);
                System.out.print(digits[Lastdigit]+" ");
        }
        public static void main(String[] args) {
                int n = 2004;
                Number_String(n);
        }
}
