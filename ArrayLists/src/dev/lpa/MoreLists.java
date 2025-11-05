package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main (String[] args){

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2)); //prints the third element from groceries

        if(groceries.contains("mustard")){ //returns true if groceries contains the string "mustard"
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt")); // prints the position of "yougurt" in groceries list
        System.out.println("last = " + groceries.lastIndexOf("yogurt")); // prints the last position of "yougurt" in groceries list

        System.out.println(groceries);
        groceries.remove(1); // removes element from index 1
        System.out.println(groceries);
        groceries.remove("yogurt"); //removes element "yogurt"
        System.out.println(groceries);

        groceries.clear(); //Clears all element from groceries
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty()); //returns true if groceries is empty

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder()); // sorts the elements ascending/alpahbetical natural
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder()); // reverse order
        System.out.println(groceries);


    }
}
