import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[4];
		String[] email = new String[4];
		for(int i=0; i<name.length; i++) {
			System.out.println("Information Author : "+(i+1));
			System.out.println("------------------------------------------------");
			System.out.print("Input author name  :");
			name[i] = scan.nextLine();
			System.out.print("Input author email :");
			email[i] = scan.nextLine();
			System.out.println("------------------------------------------------");
		}
		System.out.println();
		Author[] at = new Author[4];
		for(int i=0; i<name.length;i++) {
			at[i] = new Author(name[i],email[i]);
			System.out.println((i+1)+". "+at[i].getName()+" ("+at[i].getEmail()+")");
		}
	}
}
