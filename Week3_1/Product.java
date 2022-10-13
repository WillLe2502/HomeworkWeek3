package Week3_1;

public class Product {
	private int id;
	private String name;
	private String brand;
	private double price;
	
	public Product() {
		
	}

	public Product(int id, String name, String brand, double price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + brand + " - " + price + '$';
	}
	

}
