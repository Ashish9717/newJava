package Array2D2;

public class TransposeMatrix {
        public static void PrintTransposeMatrix(int [][] Transpose){
                for(int i = 0 ; i < Transpose.length ; i++){
                        for(int j = 0 ; j < Transpose[0].length; j++){
                             System.out.print(Transpose[i][j] +" ");
                        }
                        System.out.println();
                }
        }
        public static void main(String[] args) {
                int [][] matrix = {{2,3,7}, {5,6,7}};
                int n = 2 , m = 3;
                int[][] Transpose = new int[m][n];
                for(int i = 0 ; i< n; i++){
                        for(int j = 0; j< m ; j++){
                                Transpose[j][i] = matrix[i][j];
                        }
                }
                PrintTransposeMatrix(Transpose);
                
        }
}
