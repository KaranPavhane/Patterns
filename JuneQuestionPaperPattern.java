public class JuneQuestionPaperPattern
{
	public static void main(String x[])
	{
		for(int i=1; i<=8; i++)
		{
			int k=1;
			int l=0;
			for(int j=1; j<=7; j++)
			{
				if(i<=4)
				{
					if(j<=i*2-1)
					{
						if(j%2==0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(k+" ");
							k++;
						}
						
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					
					if(j<=7-l)
					{
							if(j<=i*2-1)
							{
								if(j%2==0)
								{
									System.out.print("*");
								}
							else
							{
								System.out.print(k+" ");
								k++;
							}
							
					}
					else
					{
						System.out.print(" ");
			
					}
					
				}
				else
				{
					System.out.print(" ");
				}
				}
			}	
			l=l+2;
			System.out.println();
		
		}

	}
	
}