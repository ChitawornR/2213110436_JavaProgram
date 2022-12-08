import javax.swing.*;

public class Lab503 {

	static int inputYear;
	public static void main(String[] args) {
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input Yaer:"));
		//boolean chkYear = CheckYear(inputYear);
		while(!CheckYear(inputYear)) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog(
					"Please input year between 1000-3000"+
			"\nInput Year, again"));
		}
		JOptionPane.showMessageDialog(null, inputYear+(isLeapYear(inputYear)
				?" is "
				:" is not ")+"Leap Year");
	}//end main
	public static boolean isLeapYear(int year) {
		if((year%4==0) && (year%100!=0) || (year%400==0)) return true;
		else return false;
	}
	public static boolean CheckYear(int year) {
		if(year>=1000||year<=3000) return true;
		else return false;
	}

}
