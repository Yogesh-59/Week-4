package JavaGenerics.DynamicOnlineMarketplace;

public class Main {
    //Method used for apply discount
    public static <T extends Product<?>> void applayDiscount(T name , double discount) {
        name.applyDiscount(discount);
    }

    public static void main(String[] args) {

        Catalog<Book> book =new Catalog<>();
        book.addProduct(new Book("The Night Of Dreams",989.90));
        book.addProduct(new Book("The Big Mouse",1289.78));
        book.addProduct(new Book("The Man of Brave",1974.90));
        applayDiscount(book.getAll().get(2), 16.9 );
        System.out.println("Get all Books");
        for (Book ans: book.getAll()){
            System.out.println(ans);
        }
        System.out.println("-----------------------------------------");
        Catalog<Clothing> cloth =new Catalog<>();
        cloth.addProduct(new Clothing("Man's Shirt",759.90));
        cloth.addProduct(new Clothing("Track Shoot",1698.78));
        cloth.addProduct(new Clothing("Coat",2974.90));
        applayDiscount(cloth.getAll().get(2), 24.9 );
        System.out.println("Get all cloths");
        for (Clothing ans: cloth.getAll()){
            System.out.println(ans);
        }
        System.out.println("---------------------------------------------");
        Catalog<Gadgets> gadget =new Catalog<>();
        gadget.addProduct(new Gadgets("Wireless Earphone",889.90));
        gadget.addProduct(new Gadgets("Camera",16289.78));
        gadget.addProduct(new Gadgets("Wi-Fi",1474.90));
        applayDiscount(gadget.getAll().get(1), 13.6 );
        System.out.println("Get all gadget");
        for (Gadgets ans: gadget.getAll()){
            System.out.println(ans);
        }
    }
}
