public class Main {

    public static void main(String[] args){

        int range = 5;
        int oddnumber = 0, evennumbers = 0;

        while (range <= 20){

            if (isEvenNumber(range)) {
                System.out.println(range + " is a even number1");
                evennumbers ++;
            }

            else{
                oddnumber ++;
            }
                range++;

            if (evennumbers == 5){
                break;
            }
            }

        System.out.println("Number of even number is " + evennumbers + ", and number of oddnumbers is " + oddnumber);


    }

    public static boolean isEvenNumber (int number){

        if ((number % 2) == 0){
            return true;
        }
        else{
            return false;
        }

    }
}
