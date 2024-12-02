class Hollow_Rhombous
{
	public static void main(String x[])
	{	
		for(int i=1; i<=4; i++)
		{
			int k=0;
			for(int j=1; j<=7; j++)
			{
				if(j==5-i)
				{
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