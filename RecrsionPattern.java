public class RecrsionPattern
{
	public static void main(String x[])
	{	
		int i=1;
		int j=1;
		DrawPattern(i);
	}
	public static void  DrawPattern(int i)
	{
		int j=1;

		if(i<=5)
		{
			if(j>=6-i)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}

		i++;
		j++;
		DrawPattern(i);
	}
}