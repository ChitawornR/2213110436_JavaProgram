import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		int[] number = new int[5];
		for(int i=0;i<number.length;i++) number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+": "));
		showEven(number);
		showOdd(number);

	}
	public static void showEven(int[] Enumber) {
		String even = "";
		for(int i=0; i<Enumber.length; i++){
			if(Enumber[i]%2==0) even = even+Enumber[i]+" ";
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+(even));
	}
	public static void showOdd(int[] oNumber) {
		String Odd = "";
		for(int i=0; i<oNumber.length; i++) {
			if(oNumber[i]%2 != 0) Odd = Odd+oNumber[i]+" ";
		}
		JOptionPane.showMessageDialog(null, "List of odd number:\n"+(Odd));
	}

}
