package patterns;

public class Butterfly_Pattern {
	
	public static void butterFly(int n) {
		//1st Half
		for(int i=1;i<=n;i++)
		{
			//stars-i
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			//spaces-2*(n-i)
			for(int j=1;j<=2*(n-i);j++)
			{
				System.out.println(" ");
			}
			//stars-i
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		//2nd Half
		for(int i=1;i<=n;i++)
		{
			//stars-i
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			//spaces-2*(n-i)
			for(int j=1;j<=2*(n-i);j++)
			{
				System.out.println(" ");
			}
			//stars-i
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
 butterFly(4);
		
	}

}
