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

        String[] sArray = {"Able", "Cain", "Noah", "joe", "Dan"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "joe") >= 0){
            System.out.println("Found joe in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};

        if(Arrays.equals(s1, s2)){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays are Not equal");
        }



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
