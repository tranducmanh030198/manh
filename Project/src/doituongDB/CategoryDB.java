package doituongDB;

import java.util.ArrayList;
import doituong.Category;

public class CategoryDB {
	
	private ArrayList<Category> categories;
	
	//Constructors
	public CategoryDB() {
		categories = new ArrayList<Category>();
		categories.add(new Category("may tinh", "mt"));
		categories.add(new Category("dien lanh", "dl"));
		
	}
	
	//Methods
	public ArrayList<Category> getCategories(){
		return categories;
	}
	
	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}
	
}
