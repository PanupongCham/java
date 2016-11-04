public class TaxCalculator{
	public static void main(String[] arg){
		double prince		= 50;
		double vat			= prince *7/100;
		double totalPrince	= prince + vat;

		System.out.println("Prince include VAT is " + totalPrince);
	}
}