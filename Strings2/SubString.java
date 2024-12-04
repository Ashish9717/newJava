package Strings2;

public class SubString {
        public static String Sub_String(String str , int si , int ei){
                String subStr ="";
                for(int i = si ; i < ei ; i++){
                        subStr += str.charAt(i);
                }
                return subStr;
        }

        public static void main(String[] args) {
                String str = "Hello world";
                // int si = 0  , ei = str.length() -1 ;
                System.out.println(Sub_String(str, 5,7));
                System.out.println(str.substring(0 , 4));
        }
        
}
