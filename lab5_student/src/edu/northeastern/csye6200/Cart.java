package edu.northeastern.csye6200;

public class Cart {
	// TODO: write your code here
	double cartTotal;
	String products;
	
	//constructor 
    public Cart() {
    	// TODO: write your code here
    	cartTotal = 0.0;
    	products = "";
    }
 
    public double getCartTotal() {
    	// TODO: write your code here
    	return cartTotal;
    }
    
    public void addProduct(Product product) {
    	// TODO: write your code here
    	if (!products.isEmpty()) {
            products += ", ";
        }
        products += "\"" + product.getItemName() + "\"";
        cartTotal += product.getPrice();
    	
    }
    
    public double calculateChange(double payment) {
    	// TODO: write your code here
    	return payment - cartTotal;
    }
    
    @Override
    public String toString() {
    	// TODO: write your code here
        return "Cart{ " + products + " }\nTotal Cart Value: $" + cartTotal;
    }
}
