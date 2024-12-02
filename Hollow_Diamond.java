class Hollow_Diamond
{
	public static void main(String x[])
	{	
		for(int i=1; i<=7; i++)
		{
			int k=0;
			for(int j=1; j<=7; j++)
			{
				if(i<=4)
				{
					if(j==5-i || j==3+i)
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
					if(j==(-3)+i  || j==11-i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");	
					}			
					
				}
				
				
			}
			System.out.print("\n");
		}
	}
}