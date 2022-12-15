import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int indexofArray = Integer.parseInt(JOptionPane.showInputDialog("input index of array:"));
		while(checkIndex(nums,indexofArray)) 
			indexofArray = Integer.parseInt(JOptionPane.showInputDialog("input index of array, again:"));
		JOptionPane.showMessageDialog(null, "Current data, nums["+(indexofArray) + "] is "+currentData(nums,indexofArray)+
				"\n"+((indexofArray-1 < 0)?"No previous data":"Previous data, nums["+(indexofArray-1) + "] is "+prevData(nums,indexofArray))+
				"\n"+((indexofArray+1 > (nums.length-1)?"No next data":"Next data, nums["+(indexofArray+1)+"] is "+nextData(nums,indexofArray))));

	}
	public static boolean checkIndex(int[] nums,int index) {
		return (index<0||(index>nums.length-1))? true:false;
	}
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	public static int prevData(int[] nums,int index) {
		return nums[index-1];
	}
	public static int nextData(int[] nums,int index) {
		return nums[index+1];
	}
}
