public class A{
	public static void main(String[] args){
		StringBuffer name = new StringBuffer("John");

		System.out.println(name);

		name.append(" Hunter");
		System.out.println(name);

		name.insert(4, "y");
		System.out.println(name);

		name.delete(2, 4);
		System.out.println(name);
	}
}