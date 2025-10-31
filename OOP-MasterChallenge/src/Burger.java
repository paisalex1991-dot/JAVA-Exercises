public class Burger extends MealOrder{

    private String type;
    private double basePrice;
    private String extraTopping1;
    private String extraTopping2;
    private String extraTopping3;
    private String extraTopping4;
    private String extraTopping5;
    private double extraTopping1Price;
    private double extraTopping2Price;
    private double extraTopping3Price;
    private double extraTopping4Price;
    private double extraTopping5Price;

    Prices prices = new Prices();


    public Burger(String type){
        this.type = type;
        this.basePrice = 40.00;

    }

    public Burger(String type, String extraTopping1){
        this(type);
        this.basePrice = 40.00;
        this.extraTopping1 = extraTopping1;
        this.extraTopping1Price =  prices.priceSelect(this.extraTopping1);;
    }

    public Burger(String type, String extraTopping1, String extraTopping2){
        this(type, extraTopping1);
        this.basePrice = 40.00;
        this.extraTopping2 = extraTopping2;
        this.extraTopping2Price = prices.priceSelect(this.extraTopping2);;


    }

    public Burger(String type, String extraTopping1, String extraTopping2, String extraTopping3){
        this(type, extraTopping1, extraTopping2);
        this.basePrice = 40.00;
        this.extraTopping3 = extraTopping3;
        this.extraTopping3Price = prices.priceSelect(this.extraTopping3);


    }

    public Burger(String type, String extraTopping1, String extraTopping2, String extraTopping3,
                  String extraTopping4, String extraTopping5) {
        this(type);
        this.extraTopping1 = extraTopping1;
        this.extraTopping2 = extraTopping2;
        this.extraTopping3 = extraTopping3;
        this.extraTopping4 = extraTopping4;
        this.extraTopping5 = extraTopping5;

    }


    public double getBurgerTotalPrice(){

        if(this.type == "DELUXE" ){
            this.basePrice = prices.priceSelect(this.type);
            System.out.println("Being a deluxe burger it costs: " + this.basePrice);
            return this.basePrice;
        }
        else if(this.type == "BASIC" ) {
            this.basePrice = prices.priceSelect(this.type);
            System.out.println("Being a Basic burger it costs: " + this.basePrice);
            return this.basePrice;

        }
        else {
            double burgerPrice =  this.extraTopping1Price + this.extraTopping2Price + this.extraTopping3Price + this.basePrice;
            System.out.println("Burger: " +this.type + " " + this.basePrice);
            double toppingPrice = this.extraTopping1Price + this.extraTopping2Price + this.extraTopping3Price;
            System.out.println("Toppings: " +this.extraTopping1 +" "+ this.extraTopping2 + " " + this.extraTopping3 + " ---> " + toppingPrice +"$");
            return burgerPrice;
        }
    }

    public String getType(){
        return this.type;
    }


}
