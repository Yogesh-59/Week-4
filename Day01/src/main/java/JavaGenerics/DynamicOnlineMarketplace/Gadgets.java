package JavaGenerics.DynamicOnlineMarketplace;
class GadgetsCategory{}
//define the category of product
public class Gadgets extends Product<GadgetsCategory> {
    //initialize the instance using constructor
    Gadgets(String name, double price){

        super(name,price);
    }
}
