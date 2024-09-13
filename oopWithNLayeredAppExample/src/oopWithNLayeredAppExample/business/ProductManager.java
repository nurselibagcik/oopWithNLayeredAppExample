package oopWithNLayeredAppExample.business;

import oopWithNLayeredAppExample.core.logging.ILogger;
import oopWithNLayeredAppExample.dataAccess.HibernateProductDao;
import oopWithNLayeredAppExample.dataAccess.IProductDao;
import oopWithNLayeredAppExample.entities.Product;

public class ProductManager {
	
	private IProductDao productDao;
	private ILogger[] loggers;
	
	public ProductManager(IProductDao productDao, ILogger[] loggers ) {
		this.productDao = productDao;
		this.loggers = loggers;
	}
	//yukarıdaki productDao ekleme işlemini aşagıda yazdığım gibi de yazabilirdim ama bu şekilde olsaydı ProductManager'e bağlı kalmımş 
	//olacaktık ama şu an istediğimiz database'e bağlanma şeklini direkt main'de ProductManager'i çağırırken seçip yazıyoruz.
	//Böylelikle interfaceler'e bağlı kalmış olduk.
	//IProductDao productDao = new HibernateProductDao();
	//productDao.add(product);

	// ürünü alıp kontrol edecek ve veritabanına ekleyecek
	public void add(Product product) throws Exception {

		// if içine girerse program sonlanır
		if (product.getPrice() < 0) {
			throw new Exception("Ürün fiyatı 0'dan düşük olamaz");
		}

		productDao.add(product);
		
		for (ILogger logger : loggers) {
			logger.log(product.getName());
		}
	}
	
	

}
