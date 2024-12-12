package Recurssion2;

import java.util.Scanner;

public class TilingProblem {
        public static int Tiling_Problem(int n){
                //Base case
                if(n == 0 || n == 1){
                        return 1;
                }

                //Veritcal Choice 
                int verticalTiles = Tiling_Problem(n-1);
                // Horizontal Choice
                int horzontalTiles = Tiling_Problem(n-2);

                int TotalWays = verticalTiles + horzontalTiles;
                return TotalWays;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(Tiling_Problem(n));
                sc.close();
        }
        
}
