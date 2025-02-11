package JavaGenerics.DynamicOnlineMarketplace;

public class Product<T> {
    //creating the instance of class
    public String name;
    public double price;
    //using constructor to initialize the instance
     Product(String name,double price){
         this.name=name;
         this.price=price;
     }
     //Method to get name
     public String getName(){

         return name;
     }
     //Method to get product price
     public double getPrice(){

         return price;
     }
     //Method to apply the discount of given product
     public void applyDiscount(double discount){

         this.price -=this.price *(discount /100);
     }
     //Method to print the result
     @Override
    public String toString(){

         return name+" and there price :"+price;
     }
}
