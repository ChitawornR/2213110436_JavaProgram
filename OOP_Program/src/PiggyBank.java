
public class PiggyBank {
	//attributes
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;
	
	//method
	public void setPiggyBank(int s) {
		clear();
		size = s;
	}
	
	public int getPiggyBank() {
		return size;
	}
	
	public void clear() {
		one=two=five=ten=0;
	}
	
	public int getTotal() {
		return one + (two*2) + (five*5) + (ten*10);
	}
	
	public void addOne(int c) {
		if(getTotal()+c >= size) System.err.println("Piggy Bank Full");
		else one += c;
	}
	
	public void addTwo(int c) {
		if(getTotal()+(c*20) >= size) System.err.println("Piggy Bank Full");
		else two += c;
	}
	
	public void addFive(int c) {
		if(getTotal()+(c*5) >= size) System.err.println("Piggy Bank Full");
		else five += c;
	}
	
	public void addTen(int c) {
		if(getTotal()+(c*10) >= size) System.err.println("Piggy Bank Full");
		else ten += c;
	}
	
}
