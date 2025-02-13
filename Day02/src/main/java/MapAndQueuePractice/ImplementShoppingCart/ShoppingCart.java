package MapAndQueuePractice.ImplementShoppingCart;
import java.util.*;
public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Double> orderedCart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedCart = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        orderedCart.put(product, price);
        sortedCart.put(price, product);
    }

    public void displayCartInOrder() {
        System.out.println("Cart Items in Order of Addition (LinkedHashMap):");
        for (Map.Entry<String, Double> entry : orderedCart.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void displayCartSortedByPrice() {
        System.out.println("Cart Items Sorted by Price (TreeMap):");
        for (Map.Entry<Double, String> entry : sortedCart.entrySet()) {
            System.out.println(entry.getValue() + " -> " + entry.getKey());
        }
    }
}
