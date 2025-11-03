package dev.lpa;

import java.util.Scanner;

public class MinimumElement {


    private static int readInteger(){
        int arraySize;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the elements for your array ");
        arraySize = scanner.nextInt();

        return arraySize;
    }

    private static int[] readElements(int arraySize){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[arraySize];
        System.out.println("Enter the array values");
        for(int i = 0; i < arraySize; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];

        for (int i :array){
            if (i < min);
            min = i;
        }
        return min;
    }
}

