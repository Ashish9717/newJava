package Array2D1;

public class DiagonalSum1 {

        // optimize solution
        public static void Diagonal_Sum1(int matrix[][]){
                int sum = 0 ,sum1= 0;
                for(int i = 0 ; i < matrix.length; i++){
                        sum += matrix[i][i];
                        if( i != matrix.length -1 - i){
                                sum1 += matrix[i][matrix.length - 1 - i];
                        }
                }
                System.out.println(sum + "," + sum1);
        }
        public static void main(String[] args) {
                int matrix[][] ={{1,2,3,4},
                                 {5,6,7,8},
                                 {9,10,11,12},
                                 {13,14,15,16}}; 
                Diagonal_Sum1(matrix);
        }
        
}
