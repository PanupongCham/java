public class Continue
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			System.out.print("<");

			if (i==2)
				continue;

			System.out.print(i + ">");
		}
	}
}