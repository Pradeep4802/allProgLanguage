// import Student.mathoperation;

// a Program to demonstrate the use of static variable  
class Student {
    // int rollno;// instance variable
    // String name;
    // static String college = "ITS";// static variable
    // // constructor

    // Student(int r, String n) {
    // rollno = r;
    // name = n;
    // }

    // // method to display the values
    // void display() {
    // System.out.println(rollno + " " + name + " " + college);
    // }

}

// Test class to show the values of objects
class mathoperation {
    static float mul(float x, float y) {
        return x * y;
    }

    static float divide(float x, float y) {
        return x / y;
    }
}

public class static_variables_program {
    public static void main(String args[]) {
        // Student s1 = new Student(111, "Karan");
        // Student s2 = new Student(222, "Aryan");
        // // we can change the college of all objects by the single line of code
        // // Student.college="BBDIT";
        // s1.display();
        // s2.display();

        float a = mathoperation.mul(4.0f, 5.0f);
        float b = mathoperation.divide(a, 2.0f);
        System.out.println("b = " + b);
    }
}