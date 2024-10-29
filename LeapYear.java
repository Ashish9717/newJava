public class LeapYear {
        public static void main(String[] args) {
                int Year = 2006 ;
                if(Year % 4 == 0 || Year % 400 == 0){
                        System.out.println("This Year is Leap Year");
                }else{
                        System.out.println("This Year is not Leap Year");
                }
        }
        
}
