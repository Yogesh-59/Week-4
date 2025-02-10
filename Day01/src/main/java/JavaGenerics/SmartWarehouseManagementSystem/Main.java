package JavaGenerics.SmartWarehouseManagementSystem;

import java.util.List;

public class Main {
    //wildcard method to display all items
    public static void displayItems(List<? extends WarehouseItem> items){
        for (WarehouseItem item:items){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        System.out.println("Electronics item List is");
        // Creating storage for Electronics item
        Storage<Electronics> electronicItem=new Storage<>();
        //adding the electronics item in list
        electronicItem.addItem(new Electronics("Electric Car"));
        electronicItem.addItem(new Electronics("Laptop"));
        electronicItem.addItem(new Electronics("Mobile Phone"));
        displayItems(electronicItem.getAll());
        System.out.println("----------------------------------------------------");

        System.out.println("Groceries item List is:");
        // Creating storage for Groceries item
        Storage<Groceries> groceriesItem=new Storage<>();
        //adding the Groceries item in list
        groceriesItem.addItem(new Groceries("Butter"));
        groceriesItem.addItem(new Groceries("Fruits"));
        groceriesItem.addItem(new Groceries("Milk"));
        displayItems(groceriesItem.getAll());
        System.out.println("----------------------------------------------------");

        System.out.println("Furniture item list is:");
        // Creating storage for Furniture item
        Storage<Furniture> furnitureItem=new Storage<>();
        //adding the Furniture item in list
        furnitureItem.addItem(new Furniture("Bad"));
        furnitureItem.addItem(new Furniture("Chair"));
        furnitureItem.addItem(new Furniture("Table"));
        displayItems(furnitureItem.getAll());
    }
}
