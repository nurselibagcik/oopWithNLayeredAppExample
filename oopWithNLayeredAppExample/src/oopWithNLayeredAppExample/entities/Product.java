package oopWithNLayeredAppExample.entities;

//ürünü ve özelliklerini burada tanımlıyoruz 
public class Product {
	private String name ;
	private int price;
	private int stock;
	
	
	
	public Product() {
		
	}

	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	//getter ve setter kısmı
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	

}
