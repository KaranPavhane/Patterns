import java.util.*;

public class String_Reverse
{
		public static void main(String x[])
		{
			Scanner ab=new Scanner(System.in);
			System.out.println("Enter the string ");
			String a=ab.nextLine();

			int start=0;
			int end;
			String temp;

			for(int i=0; i<a.length(); i++)
			{
						if(a.charAt(i)==' ' || a.charAt(i)=='\0')
						{
									end=i-1;
									if(start <end)
									{
											temp=a.charAt[start];
											a.charAt[start]=a.charAt[end];
											a.charAt[end]=temp;
											end--;
											temp++;
									}
									start =i+1;
									
						}
			}
			System.out.println("String is "+a);

		}
}