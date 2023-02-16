import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class SaveandOpen extends Employee {

	private String name;
	private String dept;

	public void insert() throws IOException {
		Scanner scan = new Scanner(System.in);
		PrintStream write = new PrintStream(new File("employee.txt"));
		String ans;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = scan.nextLine();
			System.out.print("Enter department: ");
			dept = scan.nextLine();
			System.out.print("Enter data again?: ");
			ans = scan.nextLine();
			write.println(name+"\t"+dept);
		} while (ans.equalsIgnoreCase("y"));
		write.close();
	}

	public void read() throws IOException{
		try {
			Scanner in = new Scanner(new File("employee.txt"));
			int i=0;
			boolean check = false;
			super.header();
			while(in.hasNext()) {
				name = in.next();
				dept = in.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+") "+name);
					check = true;
				}
			}
			in.close();
			if(check) {
				super.header();
				System.out.print("\nEmployee in department "+super.getDept()+" is "+i+" person.");
			}else {
				System.out.print("\nSorry, no department: "+super.getDept()+" in file.");
			}
			
		}catch(IOException e) {
			System.out.print("\nSorry, file not found...");
		}
			

	}

}
