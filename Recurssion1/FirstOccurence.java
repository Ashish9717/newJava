package Recurssion1;

public class FirstOccurence {
        public static int First_Occurence(int[] num ,int key,int i){
                if(i == num.length){
                        return -1;
                }
                if(num[i] == key){
                        return i;
                }
               return First_Occurence(num, key, i+1);
        }
        public static void main(String[] args) {
                int num[] ={2,3,4,5,6,8,8,9};
                int key = 8;
                System.out.println(First_Occurence(num, key, 0));
        }
        
}
