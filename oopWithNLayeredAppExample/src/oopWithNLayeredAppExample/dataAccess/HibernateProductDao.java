package oopWithNLayeredAppExample.dataAccess;

import oopWithNLayeredAppExample.entities.Product;

public class HibernateProductDao implements IProductDao {

	@Override
	public void add(Product product) {
		System.out.println(product.getName()+" adlı ürün Hibernate ile eklendi");
		
	}

}
