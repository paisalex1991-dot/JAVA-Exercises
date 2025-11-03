import java.util.Arrays;
import java.util.Scanner;

public class SortedArrays {

    public static int[] getIntegers(int arraySize){

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arraySize];

        for(int i = 0; i < array.length; i++){
            array[i] =  scanner.nextInt();
        }

        return array;
    }

    public static int[] sortIntegers(int[] array){
        int temp = 0;
        Arrays.sort(array);
        for(int i = 0; i <= (array.length-1)/2; i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

    public static void printArray(int[] array){

        for(int i =0; i < array.length; i++){
            System.out.printf("Element %d contents %d\n", i, array[i]);
        }


    }

}
