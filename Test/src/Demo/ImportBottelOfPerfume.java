package Demo;

public class ImportBottelOfPerfume implements Product{
	double totalAmountForImpoBottelOfPerfume;
	 double totalTaxForImpoBotelOfPerfume;
	@Override
	public void normalTaxCal(int productQty, double productPrice) {
		totalAmountForImpoBottelOfPerfume=productQty*productPrice;
		System.out.println("1 imported box of perfume: "+totalAmountForImpoBottelOfPerfume);
	
	}

	@Override
	public void importedTaxCal(int productQty, double productPrice) {
		totalTaxForImpoBotelOfPerfume=productPrice*0.15;
		totalAmountForImpoBottelOfPerfume=productPrice+totalTaxForImpoBotelOfPerfume;
		System.out.println("1 imported box of Perfume :"+totalAmountForImpoBottelOfPerfume);
	
	}

}
