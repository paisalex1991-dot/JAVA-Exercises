package dev.lpa;

public class Main {

    public static void main (String... args){

        System.out.println("Hello world again");

        String[] splitString = "Hello world again".split(" ");
        printText(splitString);

        System.out.println("-".repeat(20));
        printText("Hello");

        System.out.println("-".repeat(20));
        printText("Hello", "world", "Again"); //trimite pe rand cuvintele "Hello", "world"... catre metoda printText

        String[] sArray = {"first", "second", "third"};
        System.out.println(String.join(", ", sArray)); //joins, delimited by coma all arrays in sArray


    }

    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}
