package doituong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		List<Category> categories = new ArrayList<Category>();
		
		categories.add(new Category("may tinh", "mt"));
		categories.add(new Category("dien lanh", "dl"));
		
		products.add(new Product("may tinh xach tay A", "mt"));
		products.add(new Product("laptop X", "mt"));
		products.add(new Product("pc 2", "mt"));
		products.add(new Product("ultrabook EZ", "mt"));
		products.add(new Product("tu lanh e", "dl"));
		products.add(new Product("dieu hoa nhiet do", "dl"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập tag: ");
		
		String tag = sc.nextLine();
		
		List<Product> result = new ArrayList<Product>();
		for (Product product : products) {
			if(product.getCategory_tag().equals(tag)) {
				result.add(product);
			}
		}
		Collections.sort(result, Comparator.comparing(Product :: getName));
		for (Product product : result) {
			System.out.println(product.getName());
		}
	}

}
