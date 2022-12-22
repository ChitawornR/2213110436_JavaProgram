import java.util.*;
public class TestStudebt {
	
	static Scanner scan = new Scanner(System.in);
	static int size;
	static Student[] std;

	public static void main(String[] args) {
		System.out.print("How many student in classroom : ");
		size = scan.nextInt();
		Student[] std = new Student[size];
		System.out.println();
		for(int i=0; i<std.length; i++) {
			System.out.println("INPUT INFORMATION OF STUDNET "+(i+1));
			System.out.println("------------------------------------");
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}//end while
			System.out.println();
		}//end for
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("------------------------------------");
		for(Student chk:std) {
			if(chk.isPass()) {
				System.out.println(">> "+chk.getName()+" get grade "+findGrade(chk.getScaore()));
			}
		}
	}
	public static String findGrade(int score) {
		return (score >= 80)? "A":(score >= 75)?"B+":(score >= 70)?"B":(score >= 65)?"C+":(score >= 60)?"C":
			(score >= 55)?"D+":(score >= 50)?"D":"F";
	}

}
