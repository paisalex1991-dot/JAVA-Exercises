import java.util.Scanner;
import java.util.Set;
public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);

        Set<String> burgers = Set.of("BASIC", "DELUXE", "CHEESEBURGER", "CHICKEN", "PORK");
        Set<String> toppings = Set.of("ONIONS", "BACON", "TOMATO", "MAYO", "PESTO");
        Set<String> sides = Set.of("SALAD", "FRIES", "ONION RINGS");
        Set<String> sideSizes = Set.of("SMALL", "MEDIUM", "LARGE");
        Set<String> drinks = Set.of("COLA", "PEPSI", "MIRINDA");
        Set<String> drinkSizes = Set.of("SMALL", "MEDIUM");

        String burger = "";
        String topping = "";
        String topping2 = "";
        String topping3 = "";
        String side = "";
        String sideSize = "";
        String drink = "";
        String drinkSize = "";

        menu.welcomeMessage();
        menu.showMenu();
        menu.showOptions();
        System.out.println("ENTER YOUR ORDER!!!");



        burger = getValidChoice(sc, menu.selectBurger(), burgers);


        if (burger.equals("DELUXE")) {

            Burger newBurger = new Burger(burger);
            Drinks newdrinks = new Drinks("COLA", "LARGE");
            Sides newsSides = new Sides("FRIES", "LARGE");
            MealOrder newMealOrder = new MealOrder(newBurger, newdrinks, newsSides);

            System.out.println("-".repeat(30));
            newMealOrder.getMealPrice();;
            exitProgram();
        }
        else if (burger.equals("BASIC")) {
            Burger newBurger = new Burger(burger);
            Drinks newdrinks = new Drinks("COLA", "SMALL");
            Sides newsSides = new Sides("FRIES", "SMALL");
            MealOrder newMealOrder = new MealOrder(newBurger, newdrinks, newsSides);

            System.out.println("-".repeat(30));
            newMealOrder.getMealPrice();
            exitProgram();

        }else if (burger.equals("Q")){
            exitProgram();
        }


        topping = getValidChoice(sc, menu.selectExtraTopping(), toppings);
        if (topping.equals("Q")){
            exitProgram();
        }

        topping2 = getValidChoice(sc, menu.selectExtraTopping(), toppings);
        if (topping2.equals("Q")){
            exitProgram();
        }

        topping3 = getValidChoice(sc, menu.selectExtraTopping(), toppings);
        if (topping3.equals("Q")){
            exitProgram();
        }


        side = getValidChoice(sc, menu.selectSides(), sides);
        if (side.equals("Q")){
            exitProgram();
        }

        if(!side.equals("")) { //no side was chosen so no side size needed
            sideSize = getValidChoice(sc, menu.selectSidesSize(), sideSizes);
            if (sideSize.equals("Q")) {
                exitProgram();
            }
        }


        drink = getValidChoice(sc, menu.selectDrinks(), drinks);
        if (drink.equals("Q")){
            exitProgram();
        }


        if(!drink.equals("")) { //no drink was chosen so no side size needed
            drinkSize = getValidChoice(sc, menu.selectDrinkSize(), drinkSizes);
            if (drinkSize.equals("Q")) {
                exitProgram();
            }
        }

        System.out.println("-".repeat(30));

        sc.close();

        Burger newBurger = new Burger(burger,topping,topping2,topping3);
        Drinks newdrinks = new Drinks(drink, drinkSize);
        Sides newsSides = new Sides(side, sideSize);
        MealOrder newMealOrder = new MealOrder(newBurger, newdrinks, newsSides);
        newMealOrder.getMealPrice();
    }

    private static String getValidChoice(Scanner sc, String options, Set<String> validOptions) {
        String input;
        while (true) {
            System.out.println(options);
            System.out.print("Your choice: ");
            input = sc.nextLine().trim().toUpperCase();

            if (input.equals("Q")) {
                return "Q";
            }

            if (input.isEmpty()) {
                return "";
            }

            if (validOptions.contains(input)) {
                return input; // valid choice
            } else {
                System.out.println(" Invalid choice, please try again.\n");
            }
        }
    }


    private static void exitProgram() {
        System.exit(0);
    }

}
