package Demo;

public class Chocolate implements Product{


	 double totalAmountForChocolate;
	 double totalTaxForChocolate;
		
	public void normalTaxCal(int productQty, double productPrice) {
		totalAmountForChocolate=productQty*productPrice;
		System.out.println("1 chocolate at "+totalAmountForChocolate);

		
	}


	public void importedTaxCal(int productQty, double productPrice) {
		totalTaxForChocolate=productPrice*0.1;
		totalAmountForChocolate=productPrice+totalTaxForChocolate;
		System.out.println(" 1 imported box of chocolate at"+totalAmountForChocolate);
	}


}
