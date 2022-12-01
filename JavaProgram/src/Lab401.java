import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName = scan.nextLine();
		fullName = fullName.trim();
		String firstName,lastName;
		int space = fullName.indexOf(' ');
		if(space == -1) {
			System.out.println("Incorrect Name");
		}else {
			firstName = fullName.substring(0, space).toUpperCase();
			lastName = fullName.substring(space,fullName.length()).toLowerCase();
			System.out.println("First name: "+firstName);
			System.out.println("Last name: "+lastName);
		}

	}

}
