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

        String burger = "", topping = "", side = "", sideSize = "", drink = "", drinkSize = "";

        menu.welcomeMessage();
        menu.showMenu();
        menu.showOptions();
        System.out.println("ENTER YOUR ORDER!!!");



        burger = getValidChoice(sc,
                "Step 1 -> Select burger: BASIC / DELUXE / CHEESEBURGER / CHICKEN / PORK",
                burgers);

        if (burger.equals("Q")) {
            exitProgram();
        }
        else if (burger.equals("DELUXE")) {
            exitProgram();
        }
        else if (burger.equals("BASIC")) {
            exitProgram();

        }



        topping = getValidChoice(sc,
                "Step 2 -> Select topping: ONIONS / BACON / TOMATO / MAYO / PESTO",
                toppings);

        if (topping.equals("Q")) exitProgram();


        side = getValidChoice(sc,
                "Step 3 -> Select side: SALAD / FRIES / ONION RINGS",
                sides);

        if (side.equals("Q")) exitProgram();


        sideSize = getValidChoice(sc,
                "Step 4 -> Select side size: SMALL / MEDIUM / LARGE",
                sideSizes);

        if (sideSize.equals("Q")) exitProgram();


        drink = getValidChoice(sc,
                "Step 5 -> Select drink: COLA / PEPSI / MIRINDA",
                drinks);

        if (drink.equals("Q")) exitProgram();


        drinkSize = getValidChoice(sc,
                "Step 6 -> Select drink size: SMALL / MEDIUM",
                drinkSizes);

        if (drinkSize.equals("Q")) exitProgram();

        sc.close();

        Burger newBurger = new Burger(burger,topping);
        Drinks newdrinks = new Drinks(drink, drinkSize);
        Sides newsSides = new Sides(side, sideSize);

        MealOrder newMealOrder = new MealOrder(newBurger, newdrinks, newsSides);
        newMealOrder.getMealPrice();
    }





    private static String getValidChoice(Scanner sc, String prompt, Set<String> validOptions) {
        String input;
        while (true) {
            System.out.println(prompt);
            System.out.print("Your choice: ");
            input = sc.nextLine().trim().toUpperCase();

            if (input.equals("Q")) {
                return "Q"; // exit
            }

            if (input.isEmpty()) {
                return ""; // skip
            }

            if (validOptions.contains(input)) {
                return input; // valid choice
            } else {
                System.out.println("❌ Invalid choice, please try again.\n");
            }
        }
    }

    // 🧩 Helper method: exit gracefully
    private static void exitProgram() {
        System.out.println("\nYou chose to quit. Goodbye!");
        System.exit(0);
    }

}
