package poo;

public class Product {
	
	public String name;
	public double price;
	public int stock;
	
	public double totalValueInStock() {
		return price * stock;
	}
	
	public void addProducts(int quantity) {
		stock += quantity;
	}
	
	public void removeProducts(int quantity) {
		stock -= quantity;
	}

}
