public class TestCustomer {
	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1);
		c1.setDiscount(5);
		System.out.println(c1);
		Line();
		System.out.println("id is: "+c1.getId());// show customer's id
		System.out.println("name is: "+c1.getName());// show customer's name
		System.out.println("discount is: "+c1.getDiscount());// show customer's discount
		Line();
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		System.out.println(inv1);// Invoice's toString()
		inv1.setAmount(10000);// set invoice's amount is 10000
		System.out.println(inv1);// Invoice's toString()
		Line();
		System.out.println("id is: "+inv1.getID());// show invoice's id
		System.out.println("customer is: "+inv1.getCustomer());// Customer's toString() by instance inv1
		System.out.println("amount is: "+inv1.getAmount());// show invoice's amount
		Line();
		System.out.println("customer's id is: "+inv1.getCustomer().getId());// show customer's id by instance inv1
		System.out.println("customer's name is: "+inv1.getCustomer().getName());// show customer's name by instance inv1
		System.out.println("customer's discount is: "+inv1.getCustomer().getDiscount());// show customer's discount by instance inv1
		System.out.printf(String.format("amount after discount is: %.2f",inv1.getAmountAfterDiscount()));// show invoice's amount after discount(format as output)
	} // end of main method()

	public static void Line() {
		for(int i=0; i<50; i++) System.out.print("*");
		System.out.println();
	}
} // end of class()
