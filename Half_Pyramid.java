class Half_Pyramid
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			//boolean flag=true;
			int k=1;
			for(int j=1; j<=5; j++)
			{
				
				if(j<=i)
				{
					System.out.print( k);
					k++;
					//flag=false;
				}
				else
				{
					System.out.print("  ");
					//flag=true;
				}

				
			}
			System.out.print("\n");
		}
	}
}