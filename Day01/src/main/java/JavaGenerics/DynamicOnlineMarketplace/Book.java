package JavaGenerics.DynamicOnlineMarketplace;
//creating the class that define the product category
class BookCategory{}
//class book extends properties of product class
public class Book extends Product<BookCategory> {
    //using constructor to initialize the instance
    Book(String name,double price){

        super(name,price);
    }
}
