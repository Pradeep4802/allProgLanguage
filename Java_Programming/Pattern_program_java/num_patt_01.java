public class num_patt_01 {
	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i&&j<=4+i)
				{
					if(j<=4)
					{
					     System.out.print((j-6)/-1);
					}
					else if(j>=5)
					{
						System.out.print(j-4);
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
					
	}
}