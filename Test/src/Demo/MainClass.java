package Demo;


import Demo.Book;
import Demo.Chocolate;
import Demo.ImportBottelOfPerfume;
import Demo.ImportedBoxOfChocolate;

import Demo.ImportedBoxOfChocolate;
import Demo.MusicCD;
import Demo.Product;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Input 1:\r\n" + 
				"1 book at 12.49\r\n" + 
				"1 music CD at 14.99\r\n" + 
				"1 chocolate at 0.85\r\n" + 
				"Input 2:\r\n" + 
				"1 imported box of chocolate at 10.0\r\n" + 
				"1 imported box of chocolate at 47.5");
		
		System.out.println("--------------------");
		
		System.out.println("Output 1:");
		Book b1=new Book();
		b1.normalTaxCal(1,12.49);
		MusicCD m1=new MusicCD();
		m1.importedTaxCal(1, 14.99);
		Chocolate c1=new Chocolate();
		c1.normalTaxCal(1,0.85);
		
		double b2=b1.totalAmountForBooks;
		double m2=m1.totalAmountForMusicCD;
		double c2=c1.totalAmountForChocolate;
		
		System.out.println("Salse Taxes:"+m1.totalTaxForMusicCD);
		double total=b2+m2+c2;
		System.out.println("Total:"+total);
	
		System.out.println("Output 2:");
		
		ImportedBoxOfChocolate ic1=new ImportedBoxOfChocolate();
		ic1.importedTaxCal(1,10.00);
		
		ImportBottelOfPerfume ip1=new ImportBottelOfPerfume();
		ip1.importedTaxCal(1,47.50);
		System.out.println("Salse Taxes:"+ip1.totalTaxForImpoBotelOfPerfume);
		
		double ic2=ic1.totalAmountForImpoBoxChocolate;
		double ip2=ip1.totalAmountForImpoBottelOfPerfume;
		double Itotal=ic2+ip2;
		System.out.println("Total:"+Itotal);
	}
}
