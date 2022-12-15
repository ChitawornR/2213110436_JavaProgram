import javax.swing.*;
public class Lab_Example602 {

	public static void main(String[] args) {
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		
		double itemPrice = 0;
		boolean validItem = false;
		
		int itemOder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to oder"));
		for(int i=0;i<validValues.length;i++) {
			if(itemOder == validValues[i]) {
				validItem = true;
				itemPrice = price[i];
			}
		}
		System.out.println(((validItem)
				?"Item "+itemOder+" is "+itemPrice
				:"Invalid Item"));
		
	}

}
