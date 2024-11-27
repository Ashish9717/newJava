package Array2D;
import java.util.*;

public class Array2DCreation {

        public static boolean search(int matrix[][] , int key){
                for(int i = 0 ; i <matrix.length; i++){
                        for(int j = 0  ; j < matrix[0].length; j++){
                                if(matrix[i][j] == key){
                                System.out.print("found at cell ("+i + "," + j+")");
                                return true;
                                }
                        }
                }
                return false;
        }
        public static void main(String[] args) {
                int n = 3 , m= 3;
                int [][] matrix = new int [n][m];
                Scanner sc = new Scanner(System.in);
                //input in 2D array
                for(int i = 0 ; i <n ; i++){
                        for(int j = 0 ; j < m ; j++){
                                matrix[i][j] = sc.nextInt();
                        }
                }
                // output 2D Array
                for(int i = 0 ; i <n ; i++){
                        for(int j = 0 ; j < m ; j++){
                                System.out.print(matrix[i][j]+ " ");
                        }
                        System.out.println();
                } 
                search(matrix, 5);
                sc.close();

        }
        
        
}
