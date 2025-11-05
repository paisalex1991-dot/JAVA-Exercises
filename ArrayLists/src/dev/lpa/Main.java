package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GorceryItem(String name, String type, int count){

    public GorceryItem(String name){
        this (name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toLowerCase(), type);
    }

}

public class Main {

    public static void main(String[] args){

        GorceryItem[] groceryArray = new GorceryItem[3];
        groceryArray[0] = new GorceryItem("milk");
        groceryArray[1] = new GorceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GorceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GorceryItem("butter"));
        objectList.add("Yogurt");

        ArrayList<GorceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GorceryItem("Butter"));
        groceryList.add(new GorceryItem("milk"));
        groceryList.add(new GorceryItem("orange", "PRODUCE", 5));
        groceryList.add(0,
                new GorceryItem("apples", "PRODUCE", 5)); //adds item at the start of the list
        groceryList.set(0,
                new GorceryItem("pears", "PRODUCE", 10)); //replace item at the start of the list
        groceryList.remove(1); //removes second record from groceryList
        System.out.println(groceryList);

    }
}
