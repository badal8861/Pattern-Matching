package patterns;

public class Floyds {

	public static void floys(int n)
	{
		//outer
		int counter=1;
		for(int i=1;i<=n;i++)
		{
			//inner
			for(int j=1;j<=i;j++)
			{
				counter++;
			}
			System.out.println(counter);
		}
	}
	public static void main(String[] args) {
		floys(4);
	}
}
