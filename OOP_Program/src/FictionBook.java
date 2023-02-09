import java.time.LocalDate;

public class FictionBook implements Authorr,Bookk {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		author_name = "";
		email = "";
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		author_name = author_name.trim();
		int chk = author_name.indexOf(" ");
		if(chk==-1) return false;
		String[] data = author_name.split(" "); 
		if(data.length == 2) return true;
		return false;
	}
	
	@Override
	public String getLastName() {
		String[] data = author_name.split(" ");
		return data[1].toUpperCase();
	}
	
	@Override
	public String getFirstName() {
		String[] data = author_name.split(" ");
		return data[0].toUpperCase();
	}
	
	@Override
	public boolean checkEmail() {
		email = email.trim();
		if(email.endsWith("@hotmail.com") || email.endsWith("windowslive.com")) return true;
		return false;
	}
	
	@Override
	public int totalPublicYear() {
		return LocalDate.now().getYear() - publicYear;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return getTitle()+" write by "+getLastName().charAt(0)+"."+getFirstName()+" ("+email+")\nPublish for "+totalPublicYear()+" years.";
	}

}
