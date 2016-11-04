public class While
{
	public static void main(String[] args)
	{
		int year = 0;

		double balance = 100;
		while(balance <= 10000)
		{
			year++;
			balance *= 1.05;
		}

		System.out.println(year);
	}
}