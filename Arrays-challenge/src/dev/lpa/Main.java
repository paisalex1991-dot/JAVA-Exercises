package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main (String[] args){

        Random random = new Random();
        int i = 0;

        int[] firstArray = new int[20];

        for(i = 0; i < 20; i++){
            firstArray[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(firstArray));
                Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        for(i = 19; i >=  0; i--)
        {
            System.out.print("%d ",firstArray[i]);
        }

    }
}
