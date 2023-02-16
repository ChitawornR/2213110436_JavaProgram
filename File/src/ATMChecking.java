
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException{
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		while(read.hasNext()) {
			String accountNumber = read.next();
			String password = read.next();
			int money = read.nextInt();
			if(super.getID().equals(accountNumber) && super.getPass().equals(password) && this.money<money) {
				read.close();
				return true;
			}
		}
		read.close();
		return false;
	}
	
	public void show() throws IOException{
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		String accountNumber = read.next();
		String password = read.next();
		int money = read.nextInt();
		if(super.getID().equals(accountNumber) && super.getPass().equals(password)) {
			System.out.println("\nYou drawing for "+this.money+" Baht.");
			System.out.println("\t1000 = "+(this.money/1000));
			this.money %= 1000;
			System.out.println("\t500 = "+(this.money/500));
			this.money %= 500;
			System.out.println("\t100 = "+(this.money/100));
			System.out.println("Your balance is "+(money-this.money)+" Baht.");
		}
	}

}
