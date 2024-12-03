package Strings1;

public class PalindromeString {
        @SuppressWarnings("unused")
        public static boolean Palindrome_String(String str){
                int n = str.length();
                 for(int i = 0 ; i < n/2; i++){
                        if(str.charAt(i) == str.charAt(n-i-1));
                        System.out.println("String is palindrome");
                        return true;
                 }
                 return false;
        }         
        public static void main(String[] args) {
                String str = "noon" ;
                Palindrome_String(str);
        }
}
