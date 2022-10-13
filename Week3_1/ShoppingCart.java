package Week3_1;

public class ShoppingCart {
	private String productName;
	private int quantity;

	public ShoppingCart() {

	}

	public ShoppingCart(String productName, int quantity) {
		super();
		this.productName = productName;
		this.quantity = quantity;
	}

	public String getProduct() {
		return productName;
	}

	public void setProduct(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalProductPrice(Product product, int quantity) {
		return product.getPrice() * quantity;
	}

}
