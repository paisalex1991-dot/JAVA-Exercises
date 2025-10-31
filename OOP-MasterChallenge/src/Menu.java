public class Menu {


    public void welcomeMessage(){
        System.out.println("-".repeat(20));
        System.out.println("BILL's BURGER SHOP");
        System.out.println("-".repeat(20));

    }

    public void showMenu(){

        System.out.println("""
                MENU
                Basic burger        40$
                Deluxe burger       50$
                Cheeseburger        35$
                Chicken burger      38$
                Pork burger         35$
                
                EXTRA TOPPINGS
                Onions              2$
                Bacon               5$
                Tomato              3$
                Mayo                2$
                Pesto               5$
                
                SIDES (small/medium/large)
                Salad           2$/8$/12$
                Fries           5$/8$/10$
                O_Rings         4$/6$/8$
                
                Drinks      (small/medium)
                Cola                8$/12$
                Pepsi               2$/4$
                Mirinda             5$/7$
                """);
        System.out.println("-".repeat(20));

    }
    public void showOptions(){
        System.out.println("""
               Step 1-> Select burger: BASIC / DELUXE / CHEESEBURGER / CHICKEN / PORK
               Step 2-> Select topping: ONIONS / BACON / TOMATO / MAYO / PESTO
               Step 3-> Select side: SALAD / FRIES / ONION RINGS
               Step 4-> Select side size: SMALL / MEDIUM / LARGE
               Step 5-> Select Drinks: COLA / PEPSI / MIRINDA
               Step 6-> Select drink size: SMALL / MEDIUM 
               
               To skip a choice press ENTER
               
               Q -> to exit
                     """);
        System.out.println("-".repeat(30));

    }

    public String selectBurger(){
        return """
               Step 1-> Select burger: BASIC / DELUXE / CHEESEBURGER / CHICKEN / PORK
               """;
    }

    public String selectExtraTopping(){
        return"""
               Step 2-> Select topping: ONIONS / BACON / TOMATO / MAYO / PESTO
               """;
    }

    public String selectSides(){
        return"""
               Step 3-> Select side: SALAD / FRIES / ONION RINGS
               """;
    }
    public String selectDrinks(){
        return"""
               Step 5-> Select Drinks: COLA / PEPSI / MIRINDA 
               """;
    }
    public String selectSidesSize(){
        return"""
               Step 4-> Select side size: SMALL / MEDIUM / LARGE
               """;
    }

    public String selectDrinkSize(){
        return"""
               Step 2-> Select drink size: SMALL / MEDIUM 
               """;
    }



}
