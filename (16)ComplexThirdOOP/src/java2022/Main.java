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

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getDiscount());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getUnitsInStock());
			System.out.println(product.getImageUrl());
			System.out.println("----------------------");						
		}

	IndividualCustomer individualCustomer = new IndividualCustomer();
	individualCustomer.setId(1);
	individualCustomer.setCustomerNumber("2713814");
	individualCustomer.setPhone("05436937564");
	individualCustomer.setFirstName("Eren");
	individualCustomer.setLastName("Beken");
	
	CorporateCustomer corporateCustomer = new CorporateCustomer();
	corporateCustomer.setId(2);
	corporateCustomer.setCompanyName("elisix");
	corporateCustomer.setPhone("05432415213");
	corporateCustomer.setTaxNumber("124112462");
	corporateCustomer.setCustomerNumber("513151");
	
	Customer[] customers = {individualCustomer, corporateCustomer};
	
	
	
	
	
	
	
	
	
	
	}

}
