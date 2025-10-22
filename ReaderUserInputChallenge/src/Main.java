import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        for(int i = 1 ;i <= 5; i++) {
            System.out.println("Enter number " + i);
            enterNumber ();
        }

    }

    public static String enterNumber () {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int nb = 0;
        do {
             nb = checkNumber(scanner.nextLine());
            flag = nb < 0 ? false : true;
            if(nb < 0){

                System.out.println("Wrong number entered, try again");

            }

        } while (!flag);

        return ("Entered number id  " + nb);
    }

    public static int checkNumber(String number){
        int nb = Integer.parseInt(number);
    if((nb < Integer.MIN_VALUE) || (nb > Integer.MAX_VALUE)){

        return -1;
    }
        return nb;
    }
}
