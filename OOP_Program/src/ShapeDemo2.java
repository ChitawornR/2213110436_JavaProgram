import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		for (int i = 0; i < cylinder.length; i++) {
			System.out.print("Input radius and heigth "+(i+1)+": ");
			double radius = scan.nextDouble();
			double heigth = scan.nextDouble();
			cylinder[i] = new Cylinder(radius,heigth); 
		}
		System.out.println();
		int i = 1;
		for(Cylinder _cylinder:cylinder) {
			System.out.println("Cylinder "+i+", volume="+_cylinder.getVolume());
		}

	}

}
