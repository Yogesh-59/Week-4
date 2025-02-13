package MapAndQueuePractice.ImplementShoppingCart;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1200.00);
        cart.addProduct("Phone", 800.00);
        cart.addProduct("Headphones", 150.00);
        cart.addProduct("Mouse", 50.00);

        cart.displayCartInOrder();
        cart.displayCartSortedByPrice();
    }
}
