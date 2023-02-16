import java.io.IOException;
import java.util.Scanner;

public class ATMBanking {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException{
		System.out.print("Enter account number : ");
		String accountNumber = scan.next();
		String text = accountNumber.replace("-", "");
		boolean chkDigit = true;
		while (accountNumber.charAt(1) != '-' && accountNumber.charAt(5) != '-' && accountNumber.charAt(9) != '-'
				&& accountNumber.charAt(12) != '-' && accountNumber.length() != 14 && chkDigit) {
			System.out.println("Input wrong tpye, Enter account number  : ");
			accountNumber = scan.next();
			for(int i=0;i<text.length();i++) {
				if(text.charAt(i) >='0' && text.charAt(i) <='9') chkDigit = false;
			}
		}
		System.out.print("Enter password : ");
		String password = scan.next();
		while(password.length() != 4 && chkDigit){
			System.out.print("Enter password : ");
			password = scan.next();
			for(int i=0;i<password.length();i++) {
				if(password.charAt(i) >='0' && password.charAt(i) <='9') chkDigit = false;
			}
		}
		System.out.print("Enter money : ");
		int money = scan.nextInt();
		while(money % 100 != 0) {
			System.out.print("Enter money : ");
			money = scan.nextInt();
		}
		
		ATMChecking atm = new ATMChecking(accountNumber,password,money);
		if(atm.checkBookBank()) {
			atm.show();
		}else System.err.println("\nSorry, your id or password is wrong, or your amount not enough.");

	}

}
