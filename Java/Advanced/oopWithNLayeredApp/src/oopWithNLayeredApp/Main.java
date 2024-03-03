package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductSManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
	    Product product1 = new Product(1,"Iphone",1500);
	    
	    Logger[] loggers = {new DatabaseLogger(),new FileLogger()};
	    
	    ProductSManager productManager = new ProductSManager(new HibernateProductDao(),loggers);
	    productManager.add(product1);

	}
 
}
