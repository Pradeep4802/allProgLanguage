// import javax.security.auth.Subject;

class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    boolean isQualified() {
        return marksObtain >= maxMarks / 10 * 4;
    }

    public String toString() {
        return "\nSubject ID:" + subID + "\nName : " + name + "\nMarks Obtained: " + marksObtain;
    }
}

class Student extends Subject{
    private int rollno;
    private String name;
    private String dept;
    private String subjects[] = new String[3];

    public Student(int rollno, String name, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
    }

    public int getRollNo() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String sub1, String sub2, String sub3) {
        subjects[0] = sub1;
        subjects[1] = sub2;
        subjects[2] = sub3;
    }
}

public class arrayOfObject {
    public static void main(String[] args) {

        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algorithms", 100);
        subs[2] = new Subject("s103", "Operating Systems", 100);

        for (Subject s : subs) {
            System.out.println(s);
        }

    }
}
