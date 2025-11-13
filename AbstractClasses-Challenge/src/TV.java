public class TV extends ProductForSale{


    public TV(String type, Double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + " product has a price of " + price);
        System.out.println(description);
    }
}
