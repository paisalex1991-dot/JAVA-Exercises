package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray); //sort ascending
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5); // fills every element of the array with value 5
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] forthArray = Arrays.copyOf(thirdArray, thirdArray.length); //into forth array copies thirdArray - first thirdArray elements
        System.out.println(Arrays.toString(forthArray));


    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100); // atribuie numere random pana in cel mult 100
        }
        return newInt;
    }
}
