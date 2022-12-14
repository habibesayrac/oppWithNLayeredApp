package oopWithNLayeredApp2.business;

import java.util.List;

import oopWithNLayeredApp2.core.logging.Logger;
import oopWithNLayeredApp2.dataAccess.ProductDao;
import oopWithNLayeredApp2.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	
	private Logger[] loggers;
	


	public ProductManager(ProductDao productDao,Logger[] loggers) {
		
		this.productDao = productDao;
		this.loggers = loggers;
	}



	public void add(Product product) throws Exception{
		
		if (product.getUnitPrice()<10) {
		
			throw new Exception("!0dan k???k olamaz");
				
		}

		productDao.add(product);
		
		for(Logger logger:loggers) {
			logger.log(product.getName());
		}
		
		
	}

}
