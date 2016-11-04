public class TaxCalculatorMagicNumber {
	public static void main(String[] args){

		double tvPrice 	= 10000;
		double dvdPrice	= 600;
		double cdPrice	= 200;

		double totalTVPrice		= tvPrice 	* 1.07;
		double totalDVDPrice 	= dvdPrice  * 1.07;
		double totalCDPrice 	= cdPrice 	* 1.07;

		System.out.print("TV Price include VAT is ");
		System.out.println(totalTVPrice);

		System.out.print("DVD Price include VAT is ");
		System.out.println(totalDVDPrice);	

		System.out.print("CD Price include VAT is ");
		System.out.println(totalCDPrice);
	}
}