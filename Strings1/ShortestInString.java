package Strings1;

public class ShortestInString {

        public static float Shortest_Path_InString(String str){
                int n  = str.length();
                int y = 0 , x = 0;
                for(int i = 0 ; i< n ; i++){
                        // NOrth
                        if(str.charAt(i) == 'N'){
                                y++;
                                //South
                        }else if(str.charAt(i) == 'S'){
                                y--;

                                //West
                        }else if(str.charAt(i) == 'W'){
                                x--;
                                //East
                        }else{
                                x++;
                        }
                }
                int x2  = x*x , y2 = y*y;
                return (float)Math.sqrt(x2 + y2);
        }
        public static void main(String[] args) {
                String path = "WNEENESENNN";
                System.out.println(Shortest_Path_InString(path));
        }
        
}
