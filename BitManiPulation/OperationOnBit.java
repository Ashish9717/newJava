package BitManiPulation;

public class OperationOnBit {
        public static int GetIthBit(int num , int i){
                int bitMask = 1<<i;
                if((num & bitMask) == 0){
                        return 0;
                }else{
                        return 1;
                }
        }
        public static int SetIthBit(int num , int i){
                int bitMask = 1<<i;
                return num |bitMask;
        }
        public static int ClearIthBit(int num , int i){
                int bitMask = ~(1<<i);
                return num & bitMask;
        }
        public static int UpdateIthBit(int num , int i , int newBit){
                         if(newBit == 0){
                                return ClearIthBit(num, i);
                         }else{
                                return SetIthBit(num,i);
                         }
        }
        public static void main(String[] args) {
                int num = 10 , i = 2 , newBit = 1;
                System.out.println(GetIthBit(num, i));
                System.out.println(SetIthBit(num, i));
                System.out.println(ClearIthBit(num, i));
                System.out.println(UpdateIthBit(num, i, newBit));
        }
        
}
