public  class Pattern001
{
		public static void main(String x[])
		{
				for(int i=1; i<=7; i++)
				{
						int b=i;
								int a=1;
						for(int j=1; j<=7; j++)
						{
							
								if(i<=4)
								{
															if(j<=3+i && j>=5-i)
															{
								
																	if(j<4)
																	{
																		System.out.print(b);
																		b--;
																	}
																	if(j>=4)
																{
																			System.out.print(a);
																			a++;
																}
															}
															else
															{
																System.out.print(" ");
																}
									}
								else
								{
									 a=i;
								
										if(j>=i-3 && j<=11-i)
										{
												int c=8-i;
												if(j<4)
											{
															System.out.print(c);
															c--;
											}
											if(j>=4)
											{
														
											}
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