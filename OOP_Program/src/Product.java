
public class Product {
	//attribute
	private String id;
	private int unit;
	private double price;
	
	//method
	public void setId(String ID) {
		id = ID;
	}
	public String getId() {
		return id;
	}
	public void setUnit (int UNIT) {
		unit = UNIT;
	}
	public int getUnit() {
		return unit;
	}
	public void setPrice(double PRICE) {
		price = PRICE;
	}
	public double getPrice() {
		return price;
	}
	public double calculate() {
		return unit*price;
	}
	public String chkGrade(int grade) {
		if(grade<5) return "low";
		else if(grade >= 5 && grade <50) return "normal";
		else return "high";
	}
}
