import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int option = 0;

        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();
                System.out.println("Chose the right option " +
                "\n1 - deposit funds"+
                "\n2 - withdraw funds"+
                "\n3 - show account details" +
                "\n4 - exit aplication");

        option = scanner.nextInt();

        while(true){

            if(option == 1){

                bankAccount.depositFunds();
                System.out.println("You have deposited your funds, restart app to make a new aperation");
                break;
            }
            else if (option == 2) {
                bankAccount.withdrawFunds();
                System.out.println("Operation ended, restart app to make a new aperation");
                break;

            }
            else if (option == 3){
                bankAccount.describeBankAccount();
                break;

            }
            else if (option == 4){
                System.out.println("You have chosen to exit, restart app to make a new aperation");
                break;

            }
            else
            {
                System.out.println("The selected option doesnt not exist, select annother");

                try {
                    option = scanner.nextInt();
                }
                catch(NumberFormatException nfe){
                    System.out.println("The option does not exist, try again!");


                }

            }
        }

    }
}
