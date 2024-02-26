/*In this example:
We have a Product class representing various products with attributes like name, category, and price.
We define predicates to filter products based on price and category.
We use a method filterProducts() to filter the list of products based on a given predicate.
Finally, we demonstrate how to use these predicates to filter out expensive electronics from the list of products.
This example showcases a real-time scenario where predicates are used to filter a collection of objects based on specific criteria. 
It highlights the flexibility and power of predicates in Java for performing such filtering operations.
 * */
package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Product {
	private String name;
	private String category;
	private double price;

	public Product(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}

}

public class RealtimeExample {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Laptop", "Electronics", 1200));
		products.add(new Product("Smartphone", "Electronics", 800));
		products.add(new Product("Book", "Books", 25));
		products.add(new Product("Headphones", "Electronics", 100));
		products.add(new Product("Shirt", "Clothing", 30));

		Predicate<Product> highPriced = p -> p.getPrice() > 500;
		Predicate<Product> electronics = p -> p.getCategory().equalsIgnoreCase("Electronics");

		List<Product> expensiveElectronics = filterProduct(products, highPriced.and(electronics));

		expensiveElectronics.forEach(System.out::println);

	}

	public static List<Product> filterProduct(List<Product> products, Predicate<Product> predicate) {
		List<Product> filterList = new ArrayList<>();
		for (Product p : products) {
			if (predicate.test(p)) {
				filterList.add(p);
			}
		}
		return filterList;
	}

}
