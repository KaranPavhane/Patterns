import java.util.*;

public class CubeAndSquareApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		int a=sc.nextInt();

		int l=a;

		for(int i=1; i<=a; i++)
		{
			System.out.print(i*2+" ");
			System.out.print(" "+l*l*l+" ");
			l--;
		}

	}
}