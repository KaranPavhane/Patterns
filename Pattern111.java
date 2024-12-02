import java.util.*;

public class Pattern111
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int a=sc.nextInt();

		int b=0;
		int c=a;
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=a; j++)
			{
				if(i==1 || i==6 ||j==1 || j==6)
				{
					System.out.print(c);
						c--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			b++;
		
			System.out.println();
		}
	}
}