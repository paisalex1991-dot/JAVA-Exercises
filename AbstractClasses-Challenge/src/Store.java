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

            System.out.println("\nOrder 1");
            var order1 = new ArrayList<OrderItem>();
            addItemToOrder(order1, 1, 5);
            addItemToOrder(order1, 0, 2);
            printOrder(order1);




        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){

        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());

        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);

    }
}
