public class MealOrder {

private double mealPrice;
private Burger burger;
private Drinks drinks;
private Sides sides;

public MealOrder(){}

public MealOrder(Burger burger, Drinks drinks, Sides sides){
    this.burger = burger;
    this.drinks = drinks;
    this.sides = sides;

}

public void getMealPrice(){
    if(burger.getType().contains("BASIC")){

        this.mealPrice = burger.getBurgerTotalPrice() + drinks.getDrinksTotalPrice(burger.getType()) + sides.getSidesTotalPrice(burger.getType());
        System.out.println("-".repeat(30));
        System.out.println("BASIC MEAL IN TOTAL YOUR ORDER IS: " + this.mealPrice +  "$" + "\n ...with " +
                "toppings: ONIONS / BACON  INCLUDED + " +
                "FRIES SMALL size included +" +
                "COLA SMALL size included!");
    }
    else if (burger.getType().contains("DELUXE")){

        this.mealPrice = burger.getBurgerTotalPrice() + drinks.getDrinksTotalPrice(burger.getType()) + sides.getSidesTotalPrice(burger.getType());
        System.out.println("-".repeat(30));
        System.out.println("DELUXE MEAL IN TOTAL YOUR ORDER IS " + this.mealPrice+ "$" + " \n...with all the " +
                "toppings: ONIONS / BACON / TOMATO / MAYO / PESTO INCLUDED + " +
                "FRIES LARGE size included +!" +
                "COLO MEDIUM size included!");
    }
    else {
        this.mealPrice = burger.getBurgerTotalPrice() + drinks.getDrinksTotalPrice(burger.getType()) + sides.getSidesTotalPrice(burger.getType());
        System.out.println("-".repeat(30));
        System.out.println("IN TOTAL YOUR ORDER IS " + this.mealPrice);
    }
}

}
