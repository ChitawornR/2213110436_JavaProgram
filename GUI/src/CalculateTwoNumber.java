import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import java.util.prefs.BackingStoreException;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("Calculate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter number 1");
		lblNewLabel.setBounds(40, 31, 83, 21);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setBounds(142, 31, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter number 2");
		lblNewLabel_1.setBounds(40, 63, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		txt2 = new JTextField();
		txt2.setBounds(142, 62, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblResult.setBounds(334, 154, 61, 21);
		contentPane.add(lblResult);
		
		final JLabel operatorr = new JLabel("operator");
		operatorr.setBounds(40, 101, 46, 14);
		contentPane.add(operatorr);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(142, 97, 86, 22);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		JLabel rdbOperator = new JLabel("How to show Digit");
		rdbOperator.setBounds(40, 132, 95, 14);
		contentPane.add(rdbOperator);
		
		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(142, 128, 109, 23);
		contentPane.add(oneDigit);
		
		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(142, 157, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(twoDigit);
		group.add(oneDigit);
		
		JLabel optionShow = new JLabel("Option to show");
		optionShow.setBounds(40, 187, 46, 14);
		contentPane.add(optionShow);
		
		final JCheckBox chkDialogBox = new JCheckBox("Show result at Dialogbox");
		chkDialogBox.setBounds(142, 183, 149, 23);
		contentPane.add(chkDialogBox);
		
		
		final JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton;
				if(e.getSource()==okButton) {
					num1 = Double.parseDouble(txt1.getText());
					num2 = Double.parseDouble(txt2.getText());
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+")) sum = num1+num2;
					if(operator.equals("-")) sum = num1-num2;
					if(operator.equals("*")) sum = num1*num2;
					if(operator.equals("/")) sum = num1/num2;
					
					
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(twoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					lblResult.setText(frmNumber.format(sum));
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null, "Result is : "+sum);
					}
				}
			}
			
		});
		okButton.setBounds(103, 227, 89, 23);
		contentPane.add(okButton);
		
		final JButton exitButton = new JButton("EXIT");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setBounds(202, 227, 89, 23);
		contentPane.add(exitButton);
		
		
		
		
	}
}
