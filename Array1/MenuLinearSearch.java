package Array1;

public class MenuLinearSearch {
        public static int Menu_Search(String menu[] , String Item){
                int size = menu.length;
                for(int i = 0 ; i< size ; i++){
                        if(menu[i] == Item){
                                return i;
                        }
                }
                return -1;
        }
        public static void main(String[] args) {
                String menu[] = {"Burger" , "Cahumin" , "Momos" , "French fries" ,"Fried Rice" ,"Spring Roll"};
                String Item = "Fried Rice";

                int index = Menu_Search(menu, Item);
                if(index == -1){
                        System.out.println("Item is out of Stock");
                }else{
                        System.out.println("Item Found at index : " + index);
                }
        }
        
}
