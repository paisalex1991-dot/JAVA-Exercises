package dev.lpa;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){


        int min;


        int arraySize;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the elements for your array ");
        arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        array = readIntegers(arraySize);

        min = findMin(array);

        System.out.println("The minimum value from the given input is: " + min);




    }

    public static int[] readIntegers(int arraySize){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[arraySize];
        System.out.println("Enter the array values");
        for(int i = 0; i < arraySize; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];

        for (int i :array){
            if (min < i);
            min = i;
            }
        return min;
        }
    }

