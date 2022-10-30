package oopWithNLayeredApp2.dataAccess;

import oopWithNLayeredApp2.entities.Product;

public class JdbcProductDao implements ProductDao{
	
	public void add(Product product) {
		
		System.out.println("JDBC ile veri veritabanýna eklendi");
	}

	
}
