import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		int size = scan.nextInt();
		Product[] productList = new Product[size];
		
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
			System.out.println();
		}//end for
		
		System.out.println("-----------------------------------------");
		for(Product pd:productList) {
			System.out.println("List of product in \'LOW\' status.");
		}
	}

}
