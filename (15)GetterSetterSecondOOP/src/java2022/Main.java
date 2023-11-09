package java2022;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();

		product1.setName("Delonghi Coffee Machine");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		product2.setName("Smeg Coffee Machine");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		product3.setName("Kitchen Aid Coffee Machine");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		
		for(Product product : products) {
			System.out.println(product.getName());	
			
		}
		
		
		
	
			
		}
		
		

	}
