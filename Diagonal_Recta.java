public class Diagonal_Recta
{
	public static void main(String x[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9;j++)
			{
				if(i<=5)
				{
					if(j==6-i || j==4+i || j==5 || i==5)	
					{
						System.out.print("*");	
					
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(j==i-4 || j==14-i || j==5)
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