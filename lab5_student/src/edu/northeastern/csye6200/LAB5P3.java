package edu.northeastern.csye6200;

public class LAB5P3 {

    public static void main(String[] args) {
    	// TODO: write your code here
        Product milk = new Product("Milk", 3.7);
        Product bread = new Product("Bread", 2.25);
        Product eggs = new Product("Eggs", 4.3);

        // Add products to the cart
        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(eggs);

        // Calculate the change after the payment
        double payment = 10.0;
        double change = cart.calculateChange(payment);

        // Display the cart and change
        System.out.println("Creating the below products");
        System.out.println(milk);
        System.out.println(bread);
        System.out.println(eggs);

        System.out.println("Adding Milk and Eggs to Cart");
        System.out.println(cart);
        System.out.println("Customer payment: $" + payment);
        System.out.println("Total Change: $" + change);

    }

}








