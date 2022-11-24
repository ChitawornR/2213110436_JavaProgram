import javax.swing.*;
import java.text.*;
public class MusicWorldApp {
	public static void main(String[] args) {
		final double TAX_RATE = .0625;
	
		String cdId = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD order"
			+"\nPlease enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S.dollars"));
		int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantityto be purchased"));
		double cdSubtotal = cdQuantity*cdPrice;
		double cdTotal = cdSubtotal+(cdSubtotal*TAX_RATE);
	
		NumberFormat frm = NumberFormat.getCurrencyInstance();
		JOptionPane.showMessageDialog(null,"Summary of the transaction:\n"+
		                              "\nCD ID: "+cdId+
		                              "\nCD Title: "+cdTitle+
		                              "\nCD Unit Price: $"+cdPrice+
		                              "\nCD Quantity: "+cdQuantity+
		                              "\n\nSubtotal: $"+cdSubtotal+
		                              "\nTax rate: "+(TAX_RATE*100)+"%"+
		                              "\nTotal: $"+cdTotal+
		                              "\n\nEnd of Program");
		
	}
}

