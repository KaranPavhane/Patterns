public class Butterfly
{
	public static void main(String x[])
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10;j++)
			{
				if(i<=5)	
				{
					if(j<=i || j>=11-i)
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
					if(j<12-i || j>=i)
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