package edu.northeastern.csye6200;

public class Product {
	// TODO: write your code here
	//data fields 
	String itemName;
	double price;
	

    public Product(String itemName, double price) {
    	// TODO: write your code here
    	this.price = price;
    	this.itemName = itemName;
   
    }
    
    //getter
    public String getItemName() {
    	// TODO: write your code here
    	return itemName;
    }

    //getter
    public double getPrice() {
    	// TODO: write your code here
    	return price;
    }

    @Override
    public String toString() {
    	// TODO: write your code here
    	return "Product{ itemName = \"" + itemName + "\", price = $" + price + " }";
    }
}