package OOPS;

public class ConsTructor {
        public static void main(String[] args) {
                Student s1 = new Student("Ashish");
                System.out.println(s1.name);
                Student s2 = new Student();
                System.out.println(s2);
                Student s3 = new Student(123);
                System.out.println(s3.roll);
        }
        
}
class Student{
        String name ;
        int roll;
        Student(String name ){ // Parameterized constructor
            this.name = name;
        }
        Student(){ // Non Parameterrized constructor
                System.out.println("Constructor is called");
        }
        Student(int roll){ 
                this.roll = roll;
        }
}
