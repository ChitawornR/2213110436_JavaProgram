
public class Drink {
	private int type;
	private char size;
	
	public Drink(int type,char size) {
		this.type = type;
		this.size = size;
	}
	
	public Drink() {
		type = 0;
		size = ' ';
	}
	
	public String getTypeName() {
		return type==1?"Hot":type==2?"Cold":"";
	}
	
	public int getTypePrice() {
		return type==1?10:type==2?20:0;
	}
	
	public String getSizeName() {
		return (size+"").equalsIgnoreCase("S")?"Small":(size+"").equalsIgnoreCase("M")
				?"Medium":(size+"").equalsIgnoreCase("L")?"Lage":"";
	}
	
	public int getSizePrice() {
		return (size+"").equalsIgnoreCase("S")?15:(size+"").equalsIgnoreCase("M")
				?20:(size+"").equalsIgnoreCase("L")?25:0;
	}
	
	public int getTotalPrice() {
		return getTotalPrice()+getSizePrice();
	}

}
