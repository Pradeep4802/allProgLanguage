// /from the array given form the new array which will have the values of array but not the that are repeated

import java.util.Scanner;

// import operation.*;
public class duplicate_array_gone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length for array : ");
        int n = sc.nextInt();
        int array1 [] = new int[n];
        for(int i=0;i<n;i++)
        {
            array1[i] = sc.nextInt();
        }
        // making duplicate as negative number
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array1[i] == array1[j])
                {
                    array1[j] = -2;
                }
            }
        }
        // System.out.println("count is : "+count);
        count = 0;
        for(int i=0;i<n;i++)
        {
            if(array1[i]>0)
            {
                count++;
            }
            // System.out.println(array1[i]);
        }
        System.out.println("count is : "+count);
        int array2[] = new int[n];
        count = 0;
        for(int i=0;i<n;i++)
        {
            // count = 0;
            if(array1[i]>0)
            {
                array2[i] = array1[i];
                // count++;
            }
        }
        //printing the array after deleting the repeated ones
        System.out.println("Updated array is :");    //+" count is : "+count);
        for(int i=0;i<count;i++)
        {
            System.out.println(array2[i]);
        }
    }
}