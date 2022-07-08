// Write a java program to display greatest of 4 number.

public class greatest_3_num {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        // To check the condition we use if - else 
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greatest than " + num2 + " and " + num3);
        }
        else if (num2 > num3) {
            System.out.println(num2 + " is greatest than " + num1 + " and " + num3);
        }
        else if (num1 == num2 || num1 == num3) {
            System.out.println("All the number are the equal");
        }
        else {
            System.out.println(num3 + " is greatest than " + num1 + " and " + num2);
        }
    }
}
