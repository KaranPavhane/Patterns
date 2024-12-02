public class SumOfTwoArray
{
	int sum(int [] ...arr)
	{
		int sum=0; b,c;
		for(int b=0; b<arr;  b++)
		{
			for(c=0; c<arr[b]; c++)
			{
				sum=sum+arr[b][c];
			}
		}
		return sum;
	}

	public static void main(String x[])
	{
		

	}
}