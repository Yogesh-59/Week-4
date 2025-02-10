package JavaGenerics.SmartWarehouseManagementSystem;
//creating abstract class for all classes are extends there properties
abstract class WarehouseItem {
    //creating the instance of class
    public String name;
    //using constructor to initialize the instance
    WarehouseItem(String name){
        this.name=name;
    }
    //Method to get the item name
   public String getName(){
        return name;
   }
   //Method use to return string
   @Override
    public String toString(){
        return name;
   }
}
