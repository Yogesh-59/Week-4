package JavaGenerics.DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;
// create class Catalog to store products
public class Catalog<T extends Product<?>> {
    List<T> items=new ArrayList<>();
    //Method to add the product in list
    public void addProduct(T item){

        items.add(item);
    }
    //Method to print the all the item list
    public List<T> getAll(){

        return items;
    }

}

