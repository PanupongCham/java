public class MathRandom{
	public static void main(String[] args){
		for (int i = 0;i< 10; i++)
		{
			double r = Math.random()*100;
			int rand = (int) r;

			System.out.println(rand);
		}
	}
}