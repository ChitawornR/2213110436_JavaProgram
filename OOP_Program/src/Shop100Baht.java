import javax.swing.*;
public class Shop100Baht {
	public static void main(String[] args) {
		
		Product1 riew = new Product1();
		int choice = JOptionPane.showConfirmDialog(null, "Is the program run on Pattakarn Branch?",null,JOptionPane.YES_NO_OPTION);
		if(choice==0) {
			riew = new PattanakarnBranch();
			riew.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
			JOptionPane.showMessageDialog(null, riew);
		}else {
			riew.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
			JOptionPane.showMessageDialog(null, riew);
		}
		
		
	}
}
