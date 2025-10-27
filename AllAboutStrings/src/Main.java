import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        printInformations(string);

    }



    public static void printInformations(String string){

        int length = string.length();

        if(string.isEmpty()){
            System.out.println("String is empty!");
            //return;
        }

            System.out.println("Length of the string is: " + length);
            System.out.println("First char =  " + string.charAt(0));

            System.out.println("Last chat is = " + string.charAt(length - 1));

            System.out.println("Index of the first found letter s is: "+ string.indexOf('s'));
            System.out.println("The word java starts from : " + string.indexOf("java"));

        System.out.println("Index of the second found letter s is: "+ string.indexOf('s',4)); // searches for 's' starting from index 4



    }
}

