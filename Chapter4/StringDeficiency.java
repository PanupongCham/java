public class StringDeficiency{
	public static void main(String[] args){
		String name = "A";

		for (int i = 0; i<100; i++)
			name += "A";

		System.out.println(name);
	}
}