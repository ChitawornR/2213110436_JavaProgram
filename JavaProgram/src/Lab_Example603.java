import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		int[] number = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<number.length;i++ ) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Summation of positive number is "+sumOfPos(number));

	}
	public static int sumOfPos(int[] num) {
		int sum=0;
		for(int n : num) {
			if(n>0) sum+=n;
		}
		return sum;
		
		
	}
	

}
