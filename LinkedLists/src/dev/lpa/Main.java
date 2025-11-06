package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main (String[] args){

        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

 //       getElements(placesToVisit);
//        System.out.println(placesToVisit);

        printItinerary2(placesToVisit);



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

    private static void getElements(LinkedList<String> list){

        System.out.println("Retrived element = " + list.get(4)); // get the fifth element from the list

        System.out.println("First element = " + list.getFirst()); // get the first element from the list
        System.out.println("Last element = " + list.getLast()); // get the last element from the list

        System.out.println("Darwin is at position: " + list.indexOf("Darwin")); // gets the position where Darwin is
        System.out.println("melborne is at position " + list.lastIndexOf("melborne")); //get the position where melborne is

        //Queue retrieval methods
        System.out.println("Element from element() = " + list.element()); // return first element from list

        //Stack retreival methods
        System.out.println("Element form peak() method = " + list.peek()); //gets first element from the list
        System.out.println("Element form peakFirst() method = " + list.peekFirst()); //gets first element from the list
        System.out.println("Element form peakLast() method = " + list.peekLast()); // gets last element from the list
    }

    public static void printItinerary(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());

        for (int i = 1; i < list.size(); i++){

            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }

        System.out.println("Trip ends at " + list.getLast());


    }

    public static void printItinerary2(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list){
            System.out.println("--> From: " + previousTown + " to "+ town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());


    }

    public static void printItinerary3(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to "+ town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());


    }
}
