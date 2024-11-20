package Array3;
import java.util.*;

public class TrappingRainWater {
        public static int Trapping_Rain_Water(int height[]){

              
                
                int size = height.length; 
                  // To calculate left max boundary
                int leftMax [] = new int[size];
                leftMax[0] = height[0];
                for(int i = 1; i< size ; i++){
                        leftMax[i] = Math.max(height[i] , leftMax[i-1]);
                }
                // To calculate right max boundary
                int rightMax [] = new int[size];
                rightMax[size-1] = height[size-1];
                for(int i = size - 2; i >= 0 ; i--){
                        rightMax[i] = Math.max(height[i], rightMax[i+1]);
                }
                //loop
                int trappedWater = 0;
                 for(int i = 0 ; i < size ; i++){
                        //calculate waterLevel.
                      int waterLevel = Math.min(rightMax[i] , leftMax[i]);
                       trappedWater += waterLevel -height[i];
                }
                return trappedWater;
        }
        public static void main(String[] args) {
                int height [] ={4,2,0,3,2,5};
                System.out.println("Trapped water is :" +Trapping_Rain_Water(height));
        }
        
}
