package Recurssion2;

public class FriendsPairing {

        public static int Friend_Pairing(int n){
                if( n== 1 || n == 2){
                        return n;
                }

                //Single Choice
                int single = Friend_Pairing(n-1);
                //Pairing Choice
                int two =  Friend_Pairing(n-2);
                
                int Pair = (n-1) * two;
                

                //Total Ways
                int totalWays = single + Pair;

                return totalWays;

        }
        public static void main(String[] args) {
                int n = 3;
                System.out.println(Friend_Pairing(n));
        }
}
        

