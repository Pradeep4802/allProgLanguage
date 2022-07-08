// finding quartiles for the ungrouped data
import java.util.Scanner;
class quartiles_ungrouped_data
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the n i.e count of frequency : ");
        int n = sc.nextInt();
        System.out.println("Enter the set of data :");
        int data [] = new int [n+1];
        data [0] = 0 ;
        for(int i =1;i<=n;i++)
        {
            data[i] = sc.nextInt();
        }
        for(int i =1 ;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(data[i]<data[j])
                {
                    data[i] = data[i] + data[j];
                    data [j] = data[i] - data[j];
                    data[i] = data[i] - data[j];
                }
            }
        }
        // for(int i=1;i<=n;i++)
        // {
        //     System.out.println(data[i]);
        // }
        float q1=0,q2=0,q3=0;
        if(n%2==0)
        {
            q1 = (float)n/4;
            q2 = ((float)n*2)/4;
            q3 = ((float)n*3)/4;
        }
        if(n%2!=0)
        {
            q1 = ((float)n+1)/4;
            q2 = ((float)n+1)*2/4;
            q3 = ((float)n+1)*3/4;
        }
        System.out.println("Q1 = "+data[(int)q1]+" "+q1);
        System.out.println("Q2 = "+data[(int)q2]+" "+q2);
        System.out.println("Q3 = "+data[(int)q3]+" "+q3);

    }
}
