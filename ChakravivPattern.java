public class ChakravivPattern{
	public static void main(String []args){
	int n =9,m=1;
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++)
			{
				if(j==2 || i==2 || i==8|| j==8){
					System.out.print("  ");
				}
				else{
					System.out.print("* ");
				}

			}
			System.out.println();
			
		}
	}

}