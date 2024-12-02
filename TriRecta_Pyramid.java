public class TriRecta_Pyramid
{
	public static void main(String x[])
	{
		for(int i=1; i<=8; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i<4)
				{
					if(j==4-i || j==2+i)
					{
						System.out.print("*");
					}
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(i==4 || j==1 || i==8 || j==5)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}

	}
}