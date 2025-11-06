import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int dist){
    @Override
    public String toString(){

        return String.format("%s (%d)", name, dist);
    }
}

public class Main {

    public static void main(String[] args){


        LinkedList<Place> listOfPlaces = new LinkedList<>();
        Actions.seeMenu();

        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while(flag){
            var input = scanner.nextLine().toUpperCase(); // no matter of the option it converts to upper case
            switch(input){
                case "F", "FORWARD" -> Actions.moveForward(listOfPlaces);
                case "B", "BACKWARD" -> Actions.moveBackward(listOfPlaces);
                case "A", "ADD" -> Actions.addPlaces(listOfPlaces);
                case "R", "REMOVE" -> Actions.removePlaces(listOfPlaces);
                case "L", "LIST" -> Actions.listPlaces(listOfPlaces);
                case "M", "MENU" -> Actions.seeMenu();
                case "Q", "QUIT" -> flag = false;
                default -> System.out.println("Wrong option!");
            };
            Actions.seeMenu();
        }


    }
}


