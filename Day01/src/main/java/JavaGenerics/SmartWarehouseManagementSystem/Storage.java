package JavaGenerics.SmartWarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;
//generics class implement to store items safely.
public class Storage<T extends WarehouseItem> {
    //Define the list to store the item
    private List<T> item=new ArrayList<>();
    //Method to add item in the List
    public void addItem(T itemName){
         item.add(itemName);
    }
    //Method use to get items
    public T getItem(int index){
        return item.get(index);
    }
    //Method to return all List of item
    public List<T> getAll(){
        return item;
    }
}
