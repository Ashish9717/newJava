package Array2D2;

public class CountNumberInMatrix {
        public static int Count_Number(int [][]matrix , int key){
                int n = matrix.length , m = matrix[0].length;
                int count = 0 ;
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j < m ; j++){
                            if(matrix[i][j] == key){
                                count++;
                            }
                        }
                }
                return count;
        }
        public static void main(String[] args) {
                int [][]matrix = {{4,7,8},{8,8,7}};
                int key = 8;
                System.out.println(Count_Number(matrix, key));
        }
        
}
