public class IfElse
{
	public static void main(String[] args)
	{
		int cash	= 400;
		int prince	= 195;

		if (cash >= prince)
		{
			cash	-= prince;
			System.out.println("Use cash");
		}
		else
		{
			System.out.println("Use card");
		}

		System.out.println("Cash = " + cash);
	}
}