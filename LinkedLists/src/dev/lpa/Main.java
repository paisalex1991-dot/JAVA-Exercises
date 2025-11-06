package dev.lpa;

import java.util.LinkedList;

public class Main {

    public static void main (String[] args){

        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);



    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin"); // adds element at the start of the list
        list.addLast("Hobart"); // adds element to the end of the list

        //Queue methods
        list.offer("melborne");
        list.offerFirst("brisbane");
        list.offerLast("toowoomba");

        //Stack methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list){

        list.remove(4); //removes the fifth element from the list
        list.remove("brisbane"); // removes brisabane from the list

        String s1 = list.remove(); // removes the first element from the list and add it to s1


    }
}
