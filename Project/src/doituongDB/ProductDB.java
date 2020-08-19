package doituongDB;

import java.util.ArrayList;
import doituong.Product;

public class ProductDB {

	private ArrayList<Product> products;
	
	public ProductDB() {
		products = new ArrayList<Product>();
		products.add(new Product("may tinh xach tay A", "mt"));
		products.add(new Product("laptop X", "mt"));
		products.add(new Product("pc 2", "mt"));
		products.add(new Product("ultrabook EZ", "mt"));
		products.add(new Product("tu lanh e", "dl"));
		products.add(new Product("dieu hoa nhiet do", "dl"));
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
	
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
}
