package Week3_1;

import java.util.Scanner;

public class Week3_1 {

	public static void main(String[] args) {
		Product product1 = new Product(1, "White Shirt", "Uniqlo", 10);
		Product product2 = new Product(2, "Black Shirt", "Uniqlo", 10);
		Product product3 = new Product(3, "Green Shirt", "Uniqlo", 15);
		Product product4 = new Product(4, "Blue Shirt", "Uniqlo", 20);
		Product product5 = new Product(5, "Pink Shirt", "Uniqlo", 10);

		Product[] productLists = { product1, product2, product3, product4, product5 };

		System.out.println("Welcome to online shopping store. How can we help you today.");
		System.out.println("Press 1 to list all the products");
		System.out.println("Press 2 to start shopping");
		System.out.println("Press 3 to input your information for shipping");
		System.out.println();

		onlineStore(productLists);

		// Product product1 = new Product
		// Product[] productList = new Product;

//		System.out.print("Please input your name: ");
//		name = sc.nextLine();
//		
//		System.out.print("Please input your address: ");
//		address = sc.nextLine();

//		User user1 = new User(name, address);
//		System.out.println(user1);

	}

	public static void onlineStore(Product[] productLists) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Input your number to continue: ");
		int functionNumber;
		boolean isShopping = false;
		double total = 0;

		do {
			functionNumber = sc.nextInt();
			switch (functionNumber) {
			case 1:
				System.out.println("Product List: ");
				listProduct(productLists);
				System.out.println();
				onlineStore(productLists);
				break;
			case 2:
				if (isShopping == false) {
					total = shopping(productLists);
					isShopping = true;
				} else {
					System.out.println("Cart Already Full. Please make payment to continue.");
					System.out.println();
				}
				onlineStore(productLists);
				break;
			case 3:
				shipping(total);
				break;
//			case 4:
//				System.out.println("Print the Bill");
//				break;
			default:
				System.out.println("Invalid Number. Please Try again");
			}
		} while (functionNumber > 2 || functionNumber < 1);

	}

	public static void listProduct(Product[] productLists) {
		for (int i = 0; i < productLists.length; i++) {
			if (productLists[i] != null) {
				System.out.println(productLists[i]);
			}
		}
	}

	public static double shopping(Product[] productLists) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter product number to put into your cart. "
				+ "Please choose at least 3 products. "
				+ "You can press 0 to review your cart and payment.");
		System.out.println();
		
		int productId = 0;
		int productIdInput = 0;
		int i = 0;
		double total = 0;
		double productSum;
		int quantity;
		
		do {
			System.out.print("Please enter product number: " );
			productIdInput = sc.nextInt();
			
			while (productIdInput < 0 || productIdInput > 5)
			{
				System.out.print("Please enter product number from 1 to 5: " );
				productIdInput = sc.nextInt();
			}
			
			productId = productIdInput - 1;
			
			System.out.print("Plese enter quantity: ");
			quantity = sc.nextInt();
			productSum = (productLists[productId].getPrice() * quantity);
			total = total + productSum;
			System.out.println("Product Sum of " + productLists[productId].getName() + " is: " + productSum);
			System.out.println("Total Price: " + total);
			System.out.println();
			i++;
		}
		while (i < 3);
		
		return total;
	}
	
	public static void shipping (double total) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your name: ");
		String name = sc.nextLine();
		System.out.print("Please input your address: ");
		String address = sc.nextLine();
		
		User user = new User(name, address);
		
		//System.out.println("Your total is: " + total);
		System.out.println("Your item will be shipped to " + user.getAddress());
		System.out.println("Thank you for shopping with us!");
	}
	
	public static ShoppingCart[] addToCart(ShoppingCart[] shoppingCart, String productName, int quality, int length) {
		
		return null;
	}

}
