public class Prime {
        public static void main(String[] args) {
                int n = 87;
                for(int i = 2 ; i <= n-1 ; i++){
                    if( n % i ==0){
                        System.out.println("Number is non Prime");
                        break;
                    }else{
                        System.out.println("Number is prime");
                        break;
                    }
                }
                System.out.println();
        }

        
}
