import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input title       : ");
		String title = scan.nextLine();
		System.out.print("Input publisc year: ");
		int publiscYear = scan.nextInt();
		FictionBook book = new FictionBook(title,publiscYear);
		System.out.print("Input author name : ");
		String authorName = scan.nextLine();

	}

}
