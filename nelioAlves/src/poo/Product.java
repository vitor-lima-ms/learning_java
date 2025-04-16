package poo;

public class Product {
	
	private String name;
	private double price;
	private int stock;
	
	
	
////	Construtor
//	public Product(String name, double price, int stock) {
//		this.name = name;
//		this.price = price;
//		this.stock = stock;
//	};
//	
////	Mantendo o construtor padrão
//	public Product() {};
//	
////	Outro construtor (sobrecarga)
//	public Product(String name, double price) {
//		this.name = name;
//		this.price = price;
//	};
//	
////	Getters
//	public String getName() {
//		return this.name;
//	};
//	
//	public double getPrice() {
//		return this.price;
//	};
//	
//	public int getStock() {
//		return this.stock;
//	};
//	
////	Setters
//	public void setName(String name) {
//		this.name = name;
//	};
//	
//	public void setPrice(double price) {
//		this.price = price;
//	}
	
//	Gerados automaticamente
	public Product(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	//	Métodos
	public double totalValueInStock() {
		return this.price * this.stock;
	};
	
	public void addProducts(int quantity) {
		this.stock += quantity;
	};
	
	public void removeProducts(int quantity) {
		this.stock -= quantity;
	};
	
	public String toString() {
		return this.name;
	};

}
