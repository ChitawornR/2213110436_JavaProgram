import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book bk1 = new Book();
		
		System.out.print("Input book title   : ");
		bk1.setTitle(scan.nextLine());
		System.out.print("Input book price   : ");
		bk1.setPrice(scan.nextFloat());
		System.out.print("Input publish yesr : ");
		bk1.setPublishyear(scan.nextInt());
		System.out.println();
		
		System.out.println(bk1);

	}

}
