package Strings3;

import java.util.Scanner;

public class CountVowels {

        public static String Count_Vowels(String str){
                Integer Count = 0 ; 
                 for(int i = 0 ; i < str.length(); i++){
                        char ch = str.charAt(i);
                        if(ch == 'a' || ch== 'i' || ch == 'e' || ch== 'o' || ch == 'u' ){
                                Count++;
                        }
                 }
                 return Count.toString();
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();

                System.out.println(Count_Vowels(str));
                sc.close();
        }
        
}
