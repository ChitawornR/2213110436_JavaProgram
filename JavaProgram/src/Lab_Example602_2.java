import javax.swing.*;
public class Lab_Example602_2 {

	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean chk = false;
	
	public static void main(String[] args) {
		String dName = JOptionPane.showInputDialog("Enter a department name");
		for(String dept : deptName) {
			if(dept.equalsIgnoreCase(dName)) chk = true;
		}
		JOptionPane.showMessageDialog(null, dName + " was " +((chk)?"":"not ")+"found in the list");

	}
	
}
