public class Tri_Rect
{
	public static void main(String x[])
	{
		int row=9;
				for(int i=1; i<=row; i++)
				{
					for(int j=1; j<=row; j++)
					{
							if(i<=row%2+1)					
							{
									if(j==6-i ||  j==4+i)
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
									if(i==5 || j==1 || i==9 || j==9)
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