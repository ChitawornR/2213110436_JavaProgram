
public class Coffee extends Drink{
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public Coffee(int type,char sizeCoffee,int typeCoffee,Barista barista) {
		super(type,sizeCoffee);
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
	
	public Coffee(int type,int typeCoffee) {
		super(type,' ');
		this.typeCoffee = typeCoffee;
		sizeCoffee = ' ';
		barista = null;
	}
	
	public Barista getBarista() {
		return barista;
	}
	
	public String getTypeName() {
		return typeCoffee==1?"Americano":typeCoffee==2?"Espresso":typeCoffee==3?"Cappuccino":"";
	}
	
	public int getTypePrice() {
		return 0;
	}
	
	public String getSizeName() {
		return super.getSizeName();
	}
	

}
