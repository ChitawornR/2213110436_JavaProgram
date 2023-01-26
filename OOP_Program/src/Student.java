
public class Student {
	//The private instance variables
	private String name;
	private String address;
	//The courses and grades for the courses are kept in 2 parallel arrays
	private String[] courses;
	private int[] grades; //valid range is [0,100]
	private int numCourses; //Number of courses taken so far
	//Maximum number of courses taken by student
	private static final int MAX_COURSE = 30;
	
	/**Constructor a Student instance with the given input*/
	public Student(String name,String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int [MAX_COURSE];
		numCourses = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return getName()+"("+getAddress()+")";
	}
	
	public void addCourseGrade(String course,int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
	}
	
	public void printGrades() {
		System.out.println(name);
		for(int i=0; i<numCourses; i++) {
			System.out.println(" "+courses[i]+":"+grades[i]);
		}
		System.out.println();
	}
	
	public double getAverageGrade() {
		double avg =0; 
		for(int _grades:grades) {
			avg+=_grades;
		}
		return avg/numCourses;
	}

}
