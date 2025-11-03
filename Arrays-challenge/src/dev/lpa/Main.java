package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main (String[] args){

        Random random = new Random();

        int[] firstArray = new int[20];

        for(int i = 0; i < 20; i++){
            firstArray[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(firstArray));
                Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        for(int i = 19; i >= 0; i--);
        {
            System.out.print(firstArray[i]);
        }

    }
}
