public class IF
{
	public static void main(String[] args)
	{
		int cash = 40;
		int bookPrince = 195;

		if (cash >= 55)
		{
			cash -= bookPrince;
			System.out.println("Buy book.");
		}

		System.out.println("Cash = " + cash);
	}
}