public class IfAssign
{
	public static void main(String[] args)
	{
		int prince	= 100;
		int withdraw;

		if (prince <= 100)
			withdraw = 100;
		else
			withdraw = 200;

		System.out.println("Withdraw = " + withdraw);
	}
}