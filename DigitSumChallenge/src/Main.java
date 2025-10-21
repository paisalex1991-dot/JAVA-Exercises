public class Main {

    public static void main(String[] args){

        int nr1 = 1234, nr2 = -23;

        System.out.println("For number " + nr1 + " the sum of its digits is "+ sumDigits(nr1));
        System.out.println("For number " + nr2 + " the sum of its digits is "+ sumDigits(nr2));

    }

    public static int sumDigits(int number){

        int sum = 0;

        if (number < 0){
            return -1;

        }
        else{

            while (number != 0) {
                sum += (number % 10);
                number = number / 10;
            }
        }
        return sum;
    }
}
