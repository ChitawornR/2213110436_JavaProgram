import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[4];
		String[] email = new String[4];
		Author[] at = new Author[4];
		for(int i=0; i<name.length; i++) {
			System.out.println("Information Author : "+(i+1));
			System.out.println("------------------------------------------------");
			System.out.print("Input author name  :");
			name[i] = scan.nextLine();
			System.out.print("Input author email :");
			email[i] = scan.nextLine();
			at[i] = new Author(name[i],email[i]);
			System.out.println("------------------------------------------------");
		}
		System.out.println();
		int i=1;
		for(Author _at:at) {
			System.out.println(i+". "+_at.getName()+" ("+_at.getEmail()+")");
			i++;
		}
	}
}
