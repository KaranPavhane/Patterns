public class TriPattern
{
	public static void main(String x[])
	{
		
			for(int i=0; i<=7; i++)
			{
				int a=3;
					for(int j=0; j<=7; j++)
					{
							if(i<=4)
							{
									if(j>=5-i  && j<=3+i)
									{
										
											if(j%2!=0)
											{
												
													if(j<4)
													{
															System.out.print(--a);
															
													}
													if(j>4)
														System.out.print(++a);
													
											}
											else
											{
												System.out.print("*");
											}
									}
									else
									{
											System.out.print(" ");
									}
							}
							else
							{
										if(j>=i-3 && j<=11-i)
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