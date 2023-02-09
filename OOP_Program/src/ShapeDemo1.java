import java.util.*;
public class ShapeDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input radius: ");
		double radius = scan.nextDouble();
		System.out.print("Input heigth: ");
		double heigth = scan.nextDouble();
		
		Circle circle = new Circle(radius,"");
		System.out.println();
		System.out.println("Circle["+circle+"]");
		System.out.println("Circle["+circle.getArea()+"]");
		System.out.println();
		
		Cylinder cylinder = new Cylinder(radius,heigth);
		System.out.println("Cylinder["+cylinder+"]");
		System.out.println("Cylinder[area="+cylinder.getArea()+"]");
		System.out.println("Cylinder[volume="+cylinder.getVolume()+"]");
		
	}

}
