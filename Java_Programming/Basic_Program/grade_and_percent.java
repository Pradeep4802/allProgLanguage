// write a program to display total, percentage and grade of 5 sub's marks of students

public class grade_and_percent {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);

        int tot_marks = num1+num2+num3+num4+num5;
        float percent = (float)tot_marks / 5;

        System.out.println("Total marks: " + tot_marks);
        System.out.println("Percentage: " + percent);
        if (percent >= 85) {
            System.out.println("Grade is A with dictition");
        }
        else if (percent >= 75 && percent < 85) {
            System.out.println("Grade is A");
        }
        else if (percent >= 65 && percent < 75) {
            System.out.println("Grade is B");
        }
        else if (percent >= 55 && percent < 65) {
            System.out.println("Grade is C");
        }
        else if (percent >= 45 && percent < 55) {
            System.out.println("Grade is D");
        }
        else if (percent >= 35 && percent < 45) {
            System.out.println("Grade is E");
        }
        else {
            System.out.println("Fails!!!");
        }    
    }
}
