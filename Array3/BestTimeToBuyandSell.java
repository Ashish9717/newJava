package Array3;

public class BestTimeToBuyandSell {
        public static int Max_profit(int price[]){
                int n = price.length;
                int Buyprice = Integer.MAX_VALUE ,maxProfit = 0;
                for(int i = 0 ; i < n ; i++){
                        if(price[i] > Buyprice){
                             int profit = price[i] - Buyprice;
                             maxProfit = Math.max(maxProfit , profit);
                        }else{
                                Buyprice = price[i];
                        }
                }
                return maxProfit;
        }
        public static void main(String[] args) {
                int price[] = { 7,1 ,5,3,6,4};
               System.out.println(Max_profit(price)); 
        }
        
}
