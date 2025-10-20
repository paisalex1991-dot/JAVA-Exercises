public class Main {

    public static void main(String[] args){

        int counter = 0;
        int sum = 0;
        for (int i=1; i<=1000; i++){

            if ((i % 3 == 0) && (i % 5 == 0) && (counter <= 5)){
                counter ++;
                sum += i;

                System.out.println (i + " is even devided by 3 and 5!");

                if (counter == 5){
                    break;
                }

            }
        }

        System.out.println ("The sum is " + sum);
    }
}
