class Pattern_Rectangle
{
	public static void main(String x[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(i==1 || i==9 || j==1 || j==9 || (i==3 && (j<=7 && j>=3)) || (i==7 && (j<=7 && j>=3)) || (j==3 &&(i>=3 && i<=7)) || (j==7 && (i>=3 && i<=7)) || (i==5 && j==5) )
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}

				
			}
			System.out.print("\n");
		}
	}
}