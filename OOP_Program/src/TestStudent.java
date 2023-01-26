
public class TestStudent {

	public static void main(String[] args) {
		//Test Constructor and toString
		Student eiei = new Student("Chitaworn","1 Happy ave");
		System.out.println(eiei);
		
		//Test Setter and Getter
		eiei.setAddress("25 Pattanakarn");
		System.out.println(eiei);
		System.out.println(eiei.getName());
		System.out.println(eiei.getAddress());
		
		//Test addCourseGrade(),printGrade(), and getAverageGrade()
		eiei.addCourseGrade("INT107", 25);
		eiei.addCourseGrade("INT108", 79);
		eiei.addCourseGrade("MSC202", 69);
		System.out.println();
		
		System.out.printf("The average grade is %.2f%n",eiei.getAverageGrade());
	}

}
