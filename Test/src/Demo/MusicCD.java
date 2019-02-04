package Demo;

public class MusicCD implements Product{
	 double totalAmountForMusicCD;
	 double totalTaxForMusicCD;
		

	public void normalTaxCal(int productQty, double productPrice)
	{
		totalAmountForMusicCD=productQty*productPrice;
		System.out.println("1 music CD at "+totalAmountForMusicCD);
	}


	public void importedTaxCal(int productQty, double productPrice)
	{
		totalTaxForMusicCD=productPrice*0.1;
		totalAmountForMusicCD=productPrice+totalTaxForMusicCD;
		System.out.println("1 music CD:"+totalAmountForMusicCD);
	}

}
