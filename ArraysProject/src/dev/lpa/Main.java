package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main (String[] args){

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last element = " + firstTen[arrayLength - 1]);

        int[] newArray;
         newArray = new int[]{5, 4, 3, 2, 1};
        //newArray = new int[5];

        for (int i : newArray){ //  Take each element of newArray  Assign it to i  Run the loop body once for each value
            System.out.println(i + " ");
        }

//        for (int i=0; i< newArray.length; i++ ){
//            System.out.println(newArray[i] + " ");
//        }

        System.out.println(Arrays.toString(newArray));

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");


    }
}
