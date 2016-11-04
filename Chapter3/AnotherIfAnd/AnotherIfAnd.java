public class AnotherIfAnd
{
	public static void main(String[] args)
	{
		int cash	= 250;
		int prince	= 195;

		boolean hasEnoughCash	= cash >= prince;
		boolean reasonablePrince = prince < 200;

		if (hasEnoughCash && reasonablePrince)
			System.out.println("Buy book.");
	}
}