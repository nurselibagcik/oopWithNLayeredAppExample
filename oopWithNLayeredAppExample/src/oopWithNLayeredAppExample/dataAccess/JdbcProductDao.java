package oopWithNLayeredAppExample.dataAccess;

import oopWithNLayeredAppExample.entities.Product;

public class JdbcProductDao implements IProductDao{

	@Override
	public void add(Product product) {
		System.out.println(product.getName()+" adlı ürün JDBC ile veritabanına eklendi");
		
	}

}
