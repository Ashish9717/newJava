package OOPS;

public class CopyConstructor {
        public static void main(String[] args) {
                // Creating the first Student object
                Student s1 = new Student();
                s1.name = "Ashish";
                s1.roll = 123;
                s1.password = "insj2";
                s1.marks = new int[3]; // Initializing marks array
                s1.marks[0] = 100;
                s1.marks[1] = 90;
                s1.marks[2] = 80;

                // Creating a second Student object using copy constructor
                Student s2 = new Student(s1);
                s2.password = "xyz"; // Modifying the password
                s2.marks[2] = 100; // Modifying one of the marks

                // Printing marks of the second student
                for (int i = 0; i < 3; i++) {
                        System.out.println(s2.marks[i]);
                }
        }
}

// Student class with fields and a copy constructor
class Student {
        String name;
        int roll;
        String password;
        int marks[];

        // Default constructor
        Student() {
                marks = new int[3]; // Initialize marks array to avoid NullPointerException
        }

        // Copy constructor
        Student(Student s1) {
                this.name = s1.name;
                this.roll = s1.roll;
                this.password = s1.password;
                this.marks = new int[3]; // Deep copy of marks array
                for (int i = 0; i < s1.marks.length; i++) {
                        this.marks[i] = s1.marks[i];
                }
        }
}
