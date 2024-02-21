package patterns;

public class Rhombus {

	public static void rhombus(int n)
	{
		for(int i=1;i<=n;i++)
		{
			//spaces
			for(int j=1;j<=(n-i);j++)
			{
				System.out.println(" ");
			}
		}
		//stars
		for(int j=1;j<=n;j++)
		{
			System.out.println("*");
		}
		System.out.println(" ");
				
	}
	public static void main(String[] args) {
		rhombus(5);
	}
}
