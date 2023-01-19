
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public Author(String name,String email) {
		this.name = name;
		this.email = email;
		gender=' ';
	}
	
	public Author() {
		name = "";
		email = "";
		gender=' ';
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGenderName() {
		return ((gender+"").equals("M"))?"Male":((gender+"").equals("F"))?"Female":"";
	}
	
	public String toString() {
		return "Author name: "+name+" ("+email+";"+getGenderName()+")";
	}

}
