public class TV extends ProductForSale{


    @Override
    public void showDetails() {
        System.out.println(type + " product has a price of " + price);
        System.out.println(description);
    }
}
