import java.util.*;
public class TestPiggyBank {

	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		/*PiggyBank pb = new PiggyBank();
		
		System.out.println("Money Total : "+ pb.getTotal());
		
		pb.addTwo(34);
		System.out.println("Add 2 Bath Money: "+34);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 Bath Money "+13);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addFive(100);*/
		sizeOfPiggyBank();

	}
	public static void sizeOfPiggyBank() {
		System.out.println("Money Total : "+ pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank: "+pb.getPiggyBank());
		inputCoin();
	}
	public static void inputCoin() {
		boolean loop = true;
		while(loop) {
			System.out.println("\n===========================");
			System.out.println("Menu of PiggyBank");
			System.out.println("===========================");
			System.out.println("[1] one bath.\n"+
						"[2] two bath.\n"+
						"[3] five bath.\n"+
						"[4] ten bath.\n"+
						"[5] Exit");
			System.out.println("===========================");
			System.out.print("Please select choice: ");
			int choice = scan.nextInt();
			if(choice == 1) {
				System.out.print("Insert 1 bath : ");
				pb.addOne(scan.nextInt());
				System.out.println("Money Total : "+ pb.getTotal());
			}
			else if(choice == 2) {
				System.out.print("Insert 2 bath : ");
				pb.addTwo(scan.nextInt());
				System.out.println("Money Total : "+ pb.getTotal());
			}
			else if(choice == 3) {
				System.out.print("Insert 5 bath : ");
				pb.addFive(scan.nextInt());
				System.out.println("Money Total : "+ pb.getTotal());
			}
			else if(choice == 4) {
				System.out.print("Insert 10 bath : ");
				pb.addTen(scan.nextInt());
				System.out.println("Money Total : "+ pb.getTotal());
			}
			else if(choice == 5) {
				System.out.print("Bye Bye");
				loop = false;
			}
		}//end while
	}

}
