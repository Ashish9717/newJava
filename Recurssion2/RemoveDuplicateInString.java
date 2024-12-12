package Recurssion2;

public class RemoveDuplicateInString {
        public static void Remove_Duplicate(String str , int idx , StringBuilder sb , boolean map[] ){
                if(idx == str.length()){
                        System.out.println(sb);
                        return;
                }
                char currChar = str.charAt(idx);
                if(map[currChar - 'a'] == true){
                        //Duplicate
                        Remove_Duplicate(str, idx+1, sb, map);
                }else{
                        map[currChar - 'a'] = true;
                        Remove_Duplicate(str, idx+1, sb.append(currChar), map);
                }

        }
        public static void main(String[] args) {
                String str = "ashish";
                Remove_Duplicate(str, 0, new StringBuilder(""), new boolean[26]);
        }
        
}
