package Demo;

public class Book implements Product
{
 double totalAmountForBooks;
 double totalTaxForBooks;
	
	public void normalTaxCal(int productQty, double productPrice) 
	{
	totalAmountForBooks=productQty*productPrice;
	System.out.println("1 book: "+totalAmountForBooks);
	}

	
	public void importedTaxCal(int productQty, double productPrice) {
		
	
	}

	



	
	
	

}
