package JavaGenerics.DynamicOnlineMarketplace;
class ClothingCategory{}
//define the category of product
public class Clothing extends Product<ClothingCategory> {
    //using constructor to initialize the instance
    Clothing(String name, double price){

        super(name,price);
    }
}
