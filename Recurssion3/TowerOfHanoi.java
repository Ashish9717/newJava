package Recurssion3;

public class TowerOfHanoi {
        public static void Tower_OfHanoi(int n, String src , String Helper , String dest){
                if(n== 1){
                        System.out.println("Transferd disk " + n +" From " +src +" to " +dest);
                        return;
                }

                Tower_OfHanoi(n-1, src, Helper, dest);
                System.out.println("Transferd disk " + n +" From " +src +" to " +Helper);
                Tower_OfHanoi(n-1, src, Helper, dest);
        }
        public static void main(String[] args) {
                int n= 4; 
                Tower_OfHanoi(n, "A", "B", "C");
        }
        
}
