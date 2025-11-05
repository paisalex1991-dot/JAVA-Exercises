import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;



public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        ArrayList<String> storeItems = new ArrayList<>();
        boolean flag = true;

        while(flag){
            actions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(storeItems);
                case 2 -> removeItems(storeItems);
                default -> flag = false;
            }
            storeItems.sort(Comparator.naturalOrder());
            System.out.println(storeItems);
        }


    }

    private static void actions(){
        System.out.println("""
                Available actions: 
                0 - to shutdown
                1 - to add item(s) to the list (comma delimited)
                2 - to remove any items (comma delimited list)""");

    }

    private static void addItems(ArrayList<String> groceries){

        System.out.println("Add items separated by comma: ");
        String[] items = scanner.nextLine().split(",");

        for(String i : items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }

    }

    private static void removeItems(ArrayList<String> groceries){

        System.out.println("Add items separated by comma: ");
        String[] items = scanner.nextLine().split(",");

        for(String i : items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) > 0){
                groceries.remove(trimmed);
            }
        }

    }


}
