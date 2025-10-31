public class Sides extends MealOrder{

    private String type;
    private double price;
    private String size;

    Prices prices = new Prices();

    public Sides(String type, String size){
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getSidesTotalPrice(String burgerType){

        if((burgerType.contains("DELUXE")) || (burgerType.contains("BASIC"))){

            System.out.println("Sides : 0.00$");
            return 00.00;
        }
        else  {
            this.price = prices.priceSelect(this.type+this.size);
            System.out.println("Sides:  " + this.type + " size " + this.size + " ---> " + this.price + "$");
            return this.price;
        }
    }


}
