package project3;

public class Euler {

	public static void main(String[]arg)
	{
		Euler e = new Euler();
		e.exp();
	}
	
	public void exp()
	{
		double g;
		int k = 1;
		for (int i = 1; i <= 5000; i++)
		{
			g=(1/k) - Math.log( i + 0.5);
			System.out.println("The constant at every 100 is  " + g);
		}
	}
}
