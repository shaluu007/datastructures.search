package datastructures.search;

public class Product {
	private int id;
	private String name;
	private double price;

	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
		
	public String toString()
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
	
}