package Strings1;

public class CharAtInString {

        public static void Print_Letters(String str){
                for(int i = 0 ; i < str.length(); i++){
                        System.out.print(str.charAt(i) + " ");
                }
                System.out.println();
        }
        public static void main(String[] args) {
                String str = "Ashish singh";
                Print_Letters(str);
        }
}