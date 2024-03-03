package java2022;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();

		// set value
		product1.name = "Delonghi Coffee Machine";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "whatever1.jpg";

		// get
		// System.out.println(product1.name);

		product2.name = "Smeg Coffee Machine";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 4;
		product2.imageUrl = "whatever2.jpg";

		product3.name = "Kitchen Aid Coffee Machine";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 2;
		product3.imageUrl = "whatever3.jpg";
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
			
			
		}
		
		

	}
}
