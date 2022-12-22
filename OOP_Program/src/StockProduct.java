import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args) {
		Product[] productList = new Product[4];
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id    : ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scan.nextInt());
			while(productList[i].getUnit() <= 0) {
				System.out.print("Input product Unit, again : ");
				productList[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			while(productList[i].getPrice() <= 0) {
				System.out.print("Input product Price, again : ");
				productList[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		}//end for
		
		System.out.println("-----------------------------------------");
		for(Product pd:productList) {
			System.out.println("Product ID : "+pd.getId()+", Total price = "+frm.format(pd.calculate())+" bath.");
		}
		System.out.println("-----------------------------------------");
		double sum =0;
		for(Product cal:productList) {
			sum += cal.calculate();
		}
		System.out.println("Total price of all products is "+frm.format(sum));
	}

}
