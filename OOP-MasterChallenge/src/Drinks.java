public class Drinks extends MealOrder{

    private String type;
    private String size;
    private double sizePrice;

    Prices prices = new Prices();


    public Drinks(String type, String size){
        this.type = type;
        this.size = size;
        this.sizePrice = 0.00;
    }



    public double getDrinksTotalPrice(String burgerType){

        if((burgerType.contains("DELUXE")) || (burgerType.contains("BASIC"))){

            System.out.println("Drinks : 0.00$");
            return 00.00;
        }
        else {
            this.sizePrice = prices.priceSelect(this.type+this.size);
            System.out.println("Drinks:  " + this.type + " size " + this.size + " ---> " + this.sizePrice + "$");

            return this.sizePrice;
        }

    }

}
