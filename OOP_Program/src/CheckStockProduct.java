import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		int size = scan.nextInt();
		System.out.println();
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
		System.out.println("List of product in \'LOW\' status.");
		System.out.println("-----------------------------------------");
		for(Product pd:productList) {
			if(pd.getUnit() < 5) System.out.println(">> "+pd.getId()+" has "+pd.getUnit()+" units");
		}
		System.out.println("-----------------------------------------");
		System.out.println("List of product in \'NORMAL\' status.");
		System.out.println("-----------------------------------------");
		for(Product pd:productList) {
			if(pd.getUnit() >= 5 && pd.getUnit()<= 50) System.out.println(">> "+pd.getId()+" has "+pd.getUnit()+" units");
		}
		System.out.println("-----------------------------------------");
		System.out.println("List of product in \'HIGH\' status.");
		System.out.println("-----------------------------------------");
		for(Product pd:productList) {
			if(pd.getUnit() > 50) System.out.println(">> "+pd.getId()+" has "+pd.getUnit()+" units");
		}
	}

}
