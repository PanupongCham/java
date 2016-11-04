public class DoWhile
{
	public static void main(String[] args)
	{
		int year = 0;

		double balance = 100;
		System.out.println("Balance = " + balance);
		do{
			year++;
			balance *= 1.05;

		}while (balance <= 10000);
		System.out.println("Year = " + year);
	}
}