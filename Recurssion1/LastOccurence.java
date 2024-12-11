package Recurssion1;

public class LastOccurence {
        public static int Last_Occurence(int[] num , int key , int i){
                if(i == num.length){
                        return -1;
                }
                  int isFound = Last_Occurence(num, key, i+1);

                if(isFound == -1 && num[i] == key){
                        return i;
                }
                return isFound;

        }
        public static void main(String[] args) {
                int num[] ={1,2,3,4,2,3,4,5,6,2};
                int key = 3;
                System.out.println(Last_Occurence(num, key, 0));
        }
        
}
