public abstract class ProductForSale {

    protected String type;
    protected Double price;
    protected String description;

    public ProductForSale (String type, Double price, String description){

        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public void printPricedItem(int quantity){
        System.out.printf("%2d quantity at $%8.2f each, %-15s %-35s %n ", quantity, price, type, description);
    }

    public abstract void showDetails();



}
