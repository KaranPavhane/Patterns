import java.util.*;
public class Full_Pyramid
{
	public static void main(String x[])
	{
		for(int i=1; i<=7; i++)
		{
	
			for(int j=1; j<=13; j++)
			{


			if(j<=6+i && j>=8-i)  
				{
					System.out.print("*");
                                   }
                                    else {
					System.out.print(" ");
		                         }	
                   {
                            for( i=7;i<=13; i++)
                           {
                             for( j=1; j<=13; j++)
                             {
                             if( j>=i-6 && j<=20-i)
                           {
                              System.out.print("*");
                                 }
                           {
                               System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
}
}
}
}