abstract class ProductForSale {

    private String type;
    private Double price;
    private String description;

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public void printPricedItem(int quantity){
        System.out.println("The price of the: "+ quantity + " " + type + " is equal to: " + getSalesPrice(quantity));
    }

    public abstract void showDetails();



}
