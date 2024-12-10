package OOPS2;

public class Calculator {
        public static void main(String[] args) {
                Complax c = new Complax(4,5);
                Complax d = new Complax(9, 4);
                Complax e = Complax.add(c,d);
                Complax f = Complax.diff(c,d);
                Complax g = Complax.product(c, d);
                e.printComplax();
                f.printComplax();
                g.printComplax();
        }
        
}
class Complax{
        int real ;
        int imag;
        public Complax(int r , int i){
                real = r ;
                imag = i;
        }
        public static Complax add(Complax a , Complax b){
                return new Complax((a.real + b.real) , (a.imag - b.imag));
        }
        public static Complax diff(Complax a, Complax b){
                return new Complax((a.real-b.real) , (a.imag - b.imag));
        }
        public static Complax product(Complax a , Complax b){
                return new Complax(((a.real *b.real) - (a.imag *b.imag)) ,((a.real*b.imag) +(a.imag*b.real)));
        }
        public void printComplax(){
                if(real == 0 && imag != 0){
                        System.out.println(imag +"i");
                }else if(imag == 0 && real != 0){
                        System.out.println(real);
                }else{
                        System.out.println(real +"+" +imag +"i");
                }
        }
}