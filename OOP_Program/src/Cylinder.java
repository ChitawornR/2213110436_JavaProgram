
public class Cylinder extends Circle{
	private double heigth;
	
	public Cylinder(double radius,double heigth) {
		super(radius,"");
		this.heigth = heigth;
	}
	
	public double getHeigth() {
		return this.heigth;
	}
	
	public double getVolume() {
		return super.getArea()*getHeigth();
	}
	
	@Override
	public double getArea() {
		return 2*Math.PI*(getHeigth()+getRadius());
	}
	
	@Override
	public String toString() {
		return "heigth="+getHeigth()+","+super.toString();
	}

}
