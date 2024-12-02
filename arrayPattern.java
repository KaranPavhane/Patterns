public class arrayPattern
{
	public static void main(String x[])
	{
			int a[]={6,8,7,9,5,4,3,2,1};
			for(int i=0; i<a.length; i++)
			{
					for(int j=i; j<a.length; j++)
					{
							System.out.print(a[j]);
					}
					System.out.println();
			}
	}
}