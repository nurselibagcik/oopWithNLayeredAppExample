package oopWithNLayeredAppExample;



import oopWithNLayeredAppExample.business.ProductManager;
import oopWithNLayeredAppExample.core.logging.FileLogger;
import oopWithNLayeredAppExample.core.logging.ILogger;
import oopWithNLayeredAppExample.core.logging.MailLogger;
import oopWithNLayeredAppExample.dataAccess.JdbcProductDao;
import oopWithNLayeredAppExample.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		//ürün oluşturduk
		Product product = new Product("Telefon",100000,20);
		
		ILogger[] loggers = {new MailLogger() , new FileLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao() , loggers );
		productManager.add(product);
		
	}

}
