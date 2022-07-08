// Q1. Write a java program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Lenght and breadth of rectangle are entered through cmd.
// package pract_clg_219414;
import java.util.Scanner;

class Area {
    int len1;
    int wid1;
    void setDim(int len, int wid) {
        len1 = len;
        wid1 = wid;
    }
    int getArea() {
        return len1 * wid1;
    }
}
public class Pract_class_obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rect = new Area();
        System.out.println("Enter the length of the rectangle: ");
        int len = sc.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int wid = sc.nextInt();

        rect.setDim(len,wid);
        int AofR = rect.getArea();
        System.out.println("Area of rectangle is : " + AofR);
    }
}
