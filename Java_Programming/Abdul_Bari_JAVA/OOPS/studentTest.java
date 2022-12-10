class Student {
    // Variables properties
    public int roll;
    public String Name;
    public String course;
    public double m1, m2, m3;

    // Constructor
    Student(int roll, String Name, String course) {
        this.roll = roll;
        this.Name = Name;
        this.course = course;
        System.out.println("Name : " + this.Name);
        System.out.println("Roll No : " + this.roll);
        System.out.println("Course : " + this.course);
    }

    Student(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // methods
    public double total() {
        return m1 + m2 + m3;
    }

    public double average() {
        return total() / 3;
    }

    public String grade() {
        if (average() >= 70)
            return "A";

        else if (average() >= 60 && average() < 70)
            return "B";

        else if (average() >= 50 && average() < 60)
            return "C";

        else if (average() >= 40 && average() < 50)
            return "D";

        return "Fail";
    }
    public String toString() {
        return "Name : " + Name + "\n Roll No: : " + roll + "\n Course : " + course + "\n";
    }
}

public class studentTest {
    public static void main(String[] args) {
        Student s1 = new Student(229702, "Pradeepkumar Pal", "BscIT");
        // Student new Student(67.90, 98.70, 87.60) = new Student(67.90, 98.70, 87.60);
        // s1.m1 = 67.90;
        // s1.m2 = 98.70;
        // s1.m3 = 87.60;
        System.out.println("Total of subject marks : " + s1.total());
        System.out.println("Average of subject marks : " + s1.average());
        System.out.println("Grade of student : " + s1.grade());
        System.out.println();
        System.out.println("Total of subject marks : " + new Student(67.90, 98.70, 87.60).total());
        System.out.println("Average of subject marks : " + new Student(67.90, 98.70, 87.60).average());
        System.out.println("Grade of student : " + new Student(67.90, 98.70, 87.60).grade());
        System.out.println();
        // System.out.println("Total of subject marks : " + new Student(67.90, 98.70, 87.60).total());
        // System.out.println("Average of subject marks : " + new Student(67.90, 98.70, 87.60).average());
        // System.out.println("Grade of student : " + new Student(67.90, 98.70, 87.60).grade());
        System.out.println(s1);
    }
}
