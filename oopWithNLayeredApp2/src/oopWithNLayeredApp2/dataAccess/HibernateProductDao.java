package oopWithNLayeredApp2.dataAccess;

import oopWithNLayeredApp2.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	public void add(Product product) {
		
		System.out.println("Hibernate ile veri veritabanýna eklendi");
	}

	
}


}
