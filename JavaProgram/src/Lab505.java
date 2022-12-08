import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		String studentId;
		int subId;
		do {
		System.out.print("Enter Student Id: ");
		studentId = scan.next();
		System.out.print("Enter Subject Id: ");
		subId = scan.nextInt();
		}while(isLenght(studentId,subId));
		boolean stuChk = isITStudent(studentId);
		boolean subChk = isITSubject(subId);
		displayData(stuChk,subChk,studentId);

	}
	public static void displayData(boolean student,boolean subject,String studentId) {
		if(student == true && subject == true) 
			System.out.println("Student id: "+studentId+" 1st year student in IT and Enroll in course for Year 1");
		else if(student == false && subject == true) 
			System.out.println("Student id: "+studentId+" is not 1st year student in IT and Enroll in course for Year 1");
		else if(student == true && subject == false) 
			System.out.println("Student id: "+studentId+" is 1st year student in IT not Enroll in course for Year 1");
		else System.out.println("Student id: "+studentId+" is not 1st year student in IT not Enroll in course for Year 1");
	}
	public static boolean isITSubject(int chksub) {
		String chk = chksub+"";
		if(chk.substring(0,2).equals("21")) return true;
		else return false;
	}
	public static boolean isITStudent(String chkId) {
		if (chkId.substring(2,3).equals("1") && chkId.substring(3,6).equals("311") && chkId.substring(0,2).equals("21"))
			return true;
		else return false;
	}
	public static boolean isLenght(String stId,int subId) {
		String subIdreal = subId+"";
		if(stId.length() != 10 && subIdreal.length() != 7) return true;
		else return false;
	}

}
