package OOPS;

public class AccessModiFiers {
        public static void main(String[] args) {
                BankAccount myAcc = new BankAccount();
                myAcc.userName = "Ashish";
                myAcc.SetPassword("Absjska"); 
        }
        
}
class BankAccount{
        public String userName;
        private String password;
        public void SetPassword(String Pwd){
                password = Pwd;
        }

}
