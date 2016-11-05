public class InputData{
	public static void main(String[] args){
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);

		System.out.print("Please enter an integer :  ");
		int i = sc.nextInt();

		System.out.print("Please enter a double :  ");
		double d = sc.nextDouble();

		System.out.print("Please enter a string :  ");
		String s = sc.next();

		System.out.println(
			"Your Integer is" +i);
		System.out.println(
			"Your Double is"+ d);
		System.out.println(
			"Your String is"+ s);
	}
}