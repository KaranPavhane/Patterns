public class Hollow_Recta_Diamond
{
	public static void main(String x[])
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10;j++)
			{
				if(i<=5)	
				{
					if(j<=6-i || j>=4+i)
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
					if(j<=i-5 || j>=16-i)
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