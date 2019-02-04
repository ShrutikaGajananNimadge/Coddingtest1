package Demo;

public class ImportedBoxOfChocolate implements Product{

	 double totalAmountForImpoBoxChocolate;
	 double totalTaxForImpoBoxChocolate;
	public void normalTaxCal(int productQty, double productPrice) {
		totalAmountForImpoBoxChocolate=productQty*productPrice;
		System.out.println("1 imported box of chocolate at "+totalAmountForImpoBoxChocolate);
	}

	
	public void importedTaxCal(int productQty, double productPrice) {
		totalTaxForImpoBoxChocolate=productPrice*0.05;
		totalAmountForImpoBoxChocolate=productPrice+totalTaxForImpoBoxChocolate;
		System.out.println("1 imported box of chocolate :"+totalAmountForImpoBoxChocolate);
	
	}

	

}
