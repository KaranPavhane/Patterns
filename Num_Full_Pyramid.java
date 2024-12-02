class Num_Full_Pyramid
{
	public static void main(String x[])
	{	int k=0;
		for(int i=1; i<=5; i++)
		{
			//boolean flag=true;
			
			for(int j=1; j<=9; j++)
			{
				
				if(j>=6-i && j<=4+i )
				{
					if(j<=5){
						System.out.print(" "+(++k));
					}else{
						System.out.print(" "+(--k));
					}
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