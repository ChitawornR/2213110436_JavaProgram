import java.io.IOException;
import java.util.*;
public class EmployeeInfo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		System.out.print("Insert or Read data(from file)? : ");
		String choice = scan.next().toLowerCase();
		while(!choice.equals("insert") && !choice.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			choice = scan.next();
		}
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) file.insert();
		else {
			System.out.print("\nEnter department: ");
			String department = scan.next();
			file.setDept(department);
			file.read();
			
		}
		
	}

}
