public class TaxCalculatorConst{
	public static void main(String[] args){
		final double VAT_RATE = 1.07 ;

		double tvPrince		= 10000;
		double dvdPrince	= 600;
		double cdPrince 	= 200;

		double totalTVPrince 	= tvPrince  * VAT_RATE;
		double totalDVDPrince 	= dvdPrince * VAT_RATE;
		double totalCDPrince 	= cdPrince 	* VAT_RATE;

		System.out.print("TV Prince include VAT is ");
		System.out.println(totalTVPrince);

		System.out.print("DVD Prince include VAT is ");
		System.out.println(totalDVDPrince);

		System.out.print("CD Prince include VAT is ");
		System.out.println(totalCDPrince);  
	}
}