// Write a program to encrpt a grade by adding 8 to it to show the correct grade 
public class enc_decrpt_prog {
    public static void main (String args[]) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println("Grade = " + grade);
        grade = (char)(grade - 8);
        System.out.println("Grade = " + grade);
    }
    
}
