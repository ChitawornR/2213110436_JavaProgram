
public class Author1 {
	private String name;
	private String email;
	
	public Author1(String name,String email) {
		this.name = name;
		this.email = email; 
		//this.(name,email)
	}
	
	public Author1() {
		this.name = "";
		this.email = "";
		//this.(null,null)
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return getName()+" ("+getEmail()+")";
	}
}
