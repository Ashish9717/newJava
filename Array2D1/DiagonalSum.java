package Array2D1;

public class DiagonalSum {
        public static void Diagonal_Sum(int matrix[][]){
                int n = matrix.length , m = matrix[0].length;
                int sum = 0  , sum1 = 0;

                // Primary Sum
                for(int i = 0 ; i <n ; i++){
                        for(int j = 0 ; j < m; j++){
                                if(i == j){
                                        sum += matrix[i][j];
                                }else if(i + j == matrix.length-1){
                                        sum1 += matrix[i][j];
                                }
                        }
                }
                System.out.println("primary Digonal Sum :" + sum);
                System.out.println("Secondary Diagonal Sum :" + sum1);
                System.out.println("Total Sum :" +(sum + sum1));
        }
        public static void main(String[] args) {
                int matrix[][] ={{2,4,5},{7,8,4},{9,0,2}};
                Diagonal_Sum(matrix);
        }
}
