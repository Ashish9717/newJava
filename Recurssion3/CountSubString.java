package Recurssion3;

public class CountSubString {
        public static int Count_Substrs(String str , int i , int j , int n){
                if(n == 1){
                        return 1;
                }
                if(n <=0){
                        return 0;
                }
                int res = Count_Substrs(str, i+1, j, n-1)+
                        Count_Substrs(str, i, j-1, n-1)- Count_Substrs(str, i+1, j-1, n-2);
                         if(str.charAt(i) == str.charAt(j)){
                                res++;
                         }
                         return res;
        }
        public static void main(String[] args) {
                String str = "abcab";
                int n = str.length();
                System.out.println(Count_Substrs(str, 0, n-1, n));
        }
        
}