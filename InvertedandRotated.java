package patterns;

public class InvertedandRotated {

	public static void inverted(int n)
	{
		//outer
		for(int i=1;i<=n;i++)
		{
			//spaces
			for(int j=1;j<=n;j++)
				System.out.println(" ");
		
		//stars
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
	}
	}
	public static void main(String[] args) {
		inverted(2);
	}
}
