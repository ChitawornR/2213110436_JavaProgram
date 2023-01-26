import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Author[] at = new Author[4];
		for(int i=0; i<4; i++) {
			System.out.println("Information Author : "+(i+1));
			System.out.println("------------------------------------------------");
			System.out.print("Input author name  :");
			String name = scan.nextLine();
			System.out.print("Input author email :");
			String email = scan.nextLine();
			at[i] = new Author(name,email);
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
