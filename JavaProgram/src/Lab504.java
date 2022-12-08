import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		String firstname = fullname.substring(0,space);
		//String letter = abbreviatName(fullname);
		System.out.println(abbreviatName(fullname)+firstname);

	}
	public static String abbreviatName(String fullname) {
		String mid ="";
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i) == ' ') {
				mid = (mid + fullname.charAt(i+1)).toUpperCase()+".";
			}
		}
		return mid;
	}

}
