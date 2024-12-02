class Num_Hollow_Full_Pyramid
{
	public static void main(String x[])
	{	
		for(int i=1; i<=5; i++)
		{
			int k=0;
			for(int j=1; j<=9; j++)
			{
				
				if((j==4+i || j==6-i) && i<5)
				{
					if(j<=5)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print(i);
					}
					
					
				}
				else
				{
					System.out.print(" ");
					
					
				}
				if(i==5 && j%2!=0)
				{
					System.out.print(++k);
				}
				else
				{
					System.out.print(" ");
				}

				
			}
			System.out.print("\n");
		}
	}
}