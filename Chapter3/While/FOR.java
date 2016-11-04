public class FOR
{
	public static void main(String[] args)
	{
			double balance = 100;

			for(int year = 0; year < 95; year++)
			{
				balance *= 1.05;
			}
			System.out.println(balance);
	}
}