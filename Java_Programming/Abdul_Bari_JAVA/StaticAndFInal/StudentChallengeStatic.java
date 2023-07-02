import java.util.*;

class Account {
    private String AccNo;
    private static int count = 0;

    public String generateAccountNo() {
        count++;
        return ("000" + count);
    }

    Account() {
        AccNo = generateAccountNo();
    }

    public String getAccountNumber() {
        return AccNo;
    }
}

class Student {
    private String rollNo;
    private String name;
    private static int count = 0;
    private String generateRollNo() {
        Date d = new Date();
        String rn = "Univ-" + (d.getYear()+1900) + "-" + count;
        count++;
        return rn;
    }
    private String generateName() {
        Scanner sc = new Scanner(System.in);
        String Naam = sc.next();
        return Naam;
    }
    public Student() {
        rollNo = generateRollNo();
        name = generateName();
    }
    public String getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
}

public class StudentChallengeStatic {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        System.out.println(s1.getRollNo() + " " + s1.getName() + " " + a1.getAccountNumber());
        System.out.println(s2.getRollNo() + " " + s2.getName() + " " + a2.getAccountNumber());
        System.out.println(s3.getRollNo() + " " + s3.getName() + " " + a3.getAccountNumber());
    }
}
