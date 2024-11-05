import java.util.*;

public class Gst {
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                float pen = sc.nextFloat();
                float pencil = sc.nextFloat();
                float eraser = sc.nextFloat();
                 
                float ans = pen + pencil + eraser;
                float total = ans + (0.18f * ans) ;
                System.out.println(total);
                sc.close();
        }
        
}
