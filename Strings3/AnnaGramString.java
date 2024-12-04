package Strings3;
import java.util.*;

public class AnnaGramString {
        public static void CheckTwoStrinf_Anagram(String str1 , String str2){
                 str1 = str1.toLowerCase();
                 str2 = str2.toLowerCase();

                 if(str1.length() == str2.length()){
                        char[] Str1Arr = str1.toCharArray();
                        char[] Str2Arr = str2.toCharArray();
                        Arrays.sort(Str1Arr);
                        Arrays.sort(Str2Arr);

                        boolean result = Arrays.equals(Str1Arr, Str2Arr);
                        if(result){
                                System.out.println(str1 + "," + str2+ "," +"Both are Anagram String");
                        }else{
                                System.out.println("Not Anagram");
                        }

                 }else{
                        System.out.println("Not Anagram");
                 }

        }
        public static void main(String[] args) {
                String str1 = "earth";
                String str2 = "Ashish";

                CheckTwoStrinf_Anagram(str1, str2);
         }
        
}
