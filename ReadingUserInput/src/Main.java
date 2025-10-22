import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        int currentYear = 2025;



        System.out.println(getInputFromScanner(currentYear));

    }

  /*  public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, what is you name?");
        System.out.println("Hello " + name);

        String dateOfBirth = System.console().readLine("What year were you born ?");
        int age = currentYear - Integer.parseInt(dateOfBirth);



    return "So your are " + age + " years old";
    }
*/

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is you name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("What year were you born ?");

        boolean validDOB = false;
        int age = 0;

        do {

            System.out.println("Enter year of birth >= " + (currentYear - 125) + " and  <= " + currentYear);

           // try {

                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
           // } catch(NumberFormatException badUserData) {
                System.out.println("Characters not allowed!! try again!");
            }
        }while (!validDOB);


        return "So your are " + age + " years old";


    }

    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);
    }

}



