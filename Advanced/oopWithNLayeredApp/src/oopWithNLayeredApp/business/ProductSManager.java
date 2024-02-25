package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductSManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	
	public ProductSManager(ProductDao productDao,Logger[] loggers ){
		this.productDao = productDao;
		this.loggers= loggers;
	}


	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
			throw new Exception("unit price cannot be below 10");
		}
		
		
		productDao.add(product);
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}

}
