import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}

public class Store {

    public static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main (String[] args){

        storeProducts.add( new PC("Mac", 400.15,"Apple m1 new laptop"));
        storeProducts.add(new TV("Sony", 155.5, "Sonny 35' flat screen tv"));
        storeProducts.add(new Radios("China", 12.45, "Generec radio from china"));

        listProducts();
    }

    public static void listProducts(){

        for (var item : storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();

        }
    }
}
