public class Grade
{
	public static void main(String[] args)
	{
		char grade;
		int score	= 70;

		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 60)
		 	grade = 'C';
		else if (score >= 40)
			grade = 'D';
		else
			grade = 'F';

		switch(grade)
		{
			case 'A':
				System.out.println("Average");
				break;

			case 'B':
				System.out.println("Boring");
				break;

			case 'C':
				System.out.println("Cool");
				break;
			case 'D':
				System.out.println("Delight");
			default:
				System.out.println("Fabulous");
		}
	}
}