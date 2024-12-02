public class DoubleTriangle
{
		public static void main(String x[])
		{
				for(int i=1; i<=7; i++)
				{
					for(int j=1; j<=7; j++)
					{
						int no=0;
							if(i<=4)
							{
									if(j<=3+i && j>=5-i)
									{
										
													if(j<4 && j%2!=0 )
													{
														if(j<3)
														{
																System.out.print("2");
														}
														else
														{
																System.out.print("1");
														}
																
													}
													else
													{
																	if(j>=4 && j%2!=0 )
															{
																	
																	if(j<6)
																{
																		System.out.print("1");
																}
																else
																{
																	System.out.print("2");
																}
														
															
																}
																		else
															{
																	System.out.print("*");
															}
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
										

										if(j<4 && j%2!=0 )
													{
														if(j<3)
														{
																System.out.print("2");
														}
														else
														{
																System.out.print("1");
														}
																
													}
													else
													{
																	if(j>=4 && j%2!=0 )
															{
																	
																	if(j<6)
																{
																		System.out.print("1");
																}
																else
																{
																	System.out.print("2");
																}
																}
																		else
															{
																	System.out.print("*");
															}
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