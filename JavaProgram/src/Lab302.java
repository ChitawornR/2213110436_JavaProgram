import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input height:"));
		double bmi = weight/((height/100)*(height/100));
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+
										"\nYou're "+((bmi>30)?"Obesity":(bmi>=25.0)?"Overweight":(bmi>=18.5)?"Normal-weight":
											"Underweight"),
											"BMI",
											JOptionPane.WARNING_MESSAGE);
		

	}

}
