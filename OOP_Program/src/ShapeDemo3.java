import javax.swing.*;
public class ShapeDemo3 {
	public static void main(String[] args) {
		Cylinder[] cylinder = new Cylinder[5];
		for(int i=0; i<cylinder.length; i++) {
			String input = JOptionPane.showInputDialog(null,"Input radius and heigth "+(i+1)+": ");
			String[] data = input.split(" ");
			double radius = Double.parseDouble(data[0]);
			double heigth = Double.parseDouble(data[1]);
			cylinder[i] = new Cylinder(radius,heigth);
		}
		int i=1;
		JOptionPane.showMessageDialog(null, "Cylinder 1, volume="+cylinder[0].getVolume()+
				"\nCylinder 2, volume="+cylinder[1].getVolume()+
				"\nCylinder 3, volume="+cylinder[2].getVolume()+
				"\nCylinder 4, volume="+cylinder[3].getVolume()+
				"\nCylinder 5, volume="+cylinder[4].getVolume());
		
	}

}
