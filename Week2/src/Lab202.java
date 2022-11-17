import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int min = scan.nextInt();
		int year = min/60/24/365;
		int day = (min/60/24) - (year*365);
		System.out.println(min + " minutes is approximtely "+ year + " years and "+day+" days");
	}

}
